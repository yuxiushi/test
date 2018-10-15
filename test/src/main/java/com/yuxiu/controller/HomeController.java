
/*
 * Created by Y.Shi on 10/14/18 11:08 PM.
 * Copyright (c) 2018. All rights reserved.
 */
package com.yuxiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }
}
