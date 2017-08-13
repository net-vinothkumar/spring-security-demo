package com.learnshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MySecurityController {

    @GetMapping("/")
    public String home1() {
        return "/homePage";
    }

    @GetMapping("/homePage")
    public String home() {
        return "/homePage";
    }

    @GetMapping("/adminPage")
    public String admin() {
        return "/adminPage";
    }

    @GetMapping("/userPage")
    public String user() {
        return "/userPage";
    }

    @GetMapping("/aboutPage")
    public String about() {
        return "/aboutPage";
    }

    @GetMapping("/loginPage")
    public String login() {
        return "/loginPage";
    }

    @GetMapping("/403")
    public String error403() {
        return "/error/403";
    }

}
