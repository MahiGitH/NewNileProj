package com.bluenile.project.controllers;


import com.bluenile.project.dto.OrderDto;
import com.bluenile.project.models.Order;
import com.bluenile.project.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/order")
public class OrderController {

//    @Autowired
//    OrderService orderService;

    @GetMapping("order-index2")
    public String getOrderPage() {
        return "/order/index.html";
    }
//    @PostMapping("/add")
//    public ResponseEntity<String> createOrder(@RequestBody OrderDto orderDto){
//
//    }

//    @PostMapping("/add-to-cart")
//    public void addToCard (food){
//        repo.saveToCart(food);
//    }
}
