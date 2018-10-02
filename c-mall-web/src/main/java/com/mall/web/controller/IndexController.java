package com.mall.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/10/2 0002.
 */
@RestController
public class IndexController {

    @RequestMapping({"/","index","home"})
    public String index(){
        return "hello world";
    }
}
