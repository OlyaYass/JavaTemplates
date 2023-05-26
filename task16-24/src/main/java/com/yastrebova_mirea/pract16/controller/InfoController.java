package com.yastrebova_mirea.pract16.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InfoController {
    @RequestMapping(value = "/home")
    public String getTestPage() {
        return "baseHTML";
    }
}
