package com.mall.web.controller.system;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/10/2 0002.
 */
@RestController
@RequestMapping("/admin")
public class SystemController {

    @RequestMapping({"/","index","home"})
    public String admin(){
        return "admin";
    }
}
