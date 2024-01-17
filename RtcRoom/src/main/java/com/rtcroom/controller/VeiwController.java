package com.rtcroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class VeiwController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("name", "admin");
        return "admin/index";
    }
}
