package com.rtcroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import java.util.List;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(ModelMap mmap)
    {

        return "index";
    }

    @GetMapping("/main")
    public String main(ModelMap mmap)
    {

        return "main";
    }

    @GetMapping("/lyear_content_typography")
    public String lyear_content_typography(ModelMap mmap)
    {

        return "lyear_content_typography";
    }
    @GetMapping("/lyear_js_dropzone")
    public String lyear_js_dropzone(ModelMap mmap)
    {

        return "lyear_js_dropzone";
    }
}
