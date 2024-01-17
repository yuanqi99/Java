package com.rtcroom.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.rtcroom.model.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.rtcroom.model.AjaxResult.error;
import static com.rtcroom.model.AjaxResult.success;

@Controller
public class UserController {

    // 测试登录，浏览器访问： http://localhost:8081/user/doLogin?username=zhang&password=123456
    @RequestMapping("/log")
    public String Login(String username, String password) {
        // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对

        return "login";

    }

    // 测试登录，浏览器访问： http://localhost:8081/user/doLogin?username=zhang&password=123456
//    @RequestMapping(value = "dologin", method = RequestMethod.POST)
    @PostMapping("/dologin")
    @ResponseBody
    public AjaxResult doLogin(String username, String password) {
        // 此处仅作模拟示例，真实项目需要从数据库中查询数据进行比对 
        if ("admin".equals(username) && "123456".equals(password)) {
            StpUtil.login(10001);
            return success();
        }

        String msg = "用户或密码错误";
        return error(msg);

    }

    // 查询登录状态，浏览器访问： http://localhost:8081/user/isLogin
    @RequestMapping("isLogin")
    public String isLogin() {
        return "当前会话是否登录：" + StpUtil.isLogin();
    }

}
