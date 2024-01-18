package com.rtcroom.fileupload;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Controller
public class FileUpLoadController {

    private final static String UTF8 = "utf-8";

    @RequestMapping("/file")
    private String uploadIndex(HttpServletRequest request, HttpServletResponse response) {

        return "file/fileUpload";
    }

    @PostMapping("/upload")
    private void upload(HttpServletRequest request, HttpServletResponse response) {

        // 文件分片

        response.setCharacterEncoding(UTF8);
        //当前分片数
        Integer schunk = null;
        //总分片数
        Integer schunks = null;
        //文件名
        String fileName = null;
        //文件路径
        String uploadPath = "C:\\Users\\shanju\\OneDrive\\文档\\file";

        BufferedOutputStream os = null;

        try {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            // 缓冲区
            factory.setSizeThreshold(1024);
            // 临时目录
            factory.setRepository(new File(uploadPath));

            ServletFileUpload upload = new ServletFileUpload(factory);
            //限制问价大小
            upload.setFileSizeMax(5 * 1024 * 1024);
            upload.setSizeMax(10 * 1024 * 1024);
            List<FileItem> fileItems = upload.parseRequest(request);

            for (FileItem item : fileItems) {
                if (item.isFormField()) {
                    if ("chunk".equals(item.getFieldName())) {
                        schunk =  Integer.parseInt(item.getString(UTF8));
                    }

                    if ("chunks".equals(item.getFieldName())) {
                        schunks =  Integer.parseInt(item.getString(UTF8));
                    }

                    if ("name".equals(item.getFieldName())) {
                        fileName =  item.getString(UTF8);
                    }
                }
            }
            for (FileItem item : fileItems) {
                if (!item.isFormField()) {
                    String temp = fileName;
                    if ( fileName != null) {
                        if (schunk != null) {
                            temp = schunk + "_"+fileName;
                        }
                        File tempFile = new File(uploadPath,temp);
                        if (!tempFile.exists()) {
                            item.write(tempFile);  //断点续传
                        }
                    }
                }
            }
            //合并文件
            if (schunk != null && schunk.intValue()==schunks -1) {
                //写文件
                File tempFile = new File(uploadPath, fileName);
                os = new BufferedOutputStream(new FileOutputStream(tempFile));

                for (int i = 0; i < schunks; i++) {
                    File file = new File(uploadPath, i + "_" + fileName);
                    while (!file.exists()) {

                    }

                    byte[] bytes = FileUtils.readFileToByteArray(file);
                    os.write(bytes);
                    os.flush();
                    tempFile.delete();
                }
                os.flush();
            }

            response.getWriter().write("上传成功！");
        } catch (Exception exception) {

        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
