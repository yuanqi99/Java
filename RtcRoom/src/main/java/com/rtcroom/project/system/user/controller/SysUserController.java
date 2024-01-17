package com.rtcroom.project.system.user.controller;

import com.rtcroom.project.system.user.domain.SysUser;
import com.rtcroom.project.system.user.service.ISysUserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author yuanqi
 * @since 2024-01-15
 */
@Controller
@RequestMapping("/system/sysUser")
@Tag(name = "系统用户", description = "系统用户")
public class SysUserController {

    public final ISysUserService sysUserService;

    public SysUserController(ISysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public String addUser(@RequestBody SysUser entity){
        boolean save = sysUserService.save(entity);
        return save ? "ok" : "no OK！！";
    }



}
