package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by doobo@foxmail.com on 2017/7/6.
 */
@Controller
public class IndexController {

    @GetMapping("/next")
    public String toNext(){
        return "index";
    }
}
