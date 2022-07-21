package com.bluenile.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage {

    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/order")
    public String getOrderPage() {
        return "order/index.html";
    }

    @GetMapping("/menu")
    public String getMenuPage() {
        return "menu/index.html";
    }

    @GetMapping("/contact")
    public String getContactPage() {
        return "contact/contact1.html";
    }
}

