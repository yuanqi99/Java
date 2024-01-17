package com.rtcroom.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
@Tag(name = "文章接口", description = "文章接口")
public class ArticleController {
    public ArticleController() {
        System.out.println("创建~~~");
    }

    @RequestMapping("/menus")
    public String menus(){
        return "hello";
    }
}
