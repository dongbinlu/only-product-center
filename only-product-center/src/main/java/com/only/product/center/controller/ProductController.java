package com.only.product.center.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {


    @GetMapping("/{id}")
    public String product(@PathVariable("id") Integer id/*, @RequestHeader("token") String token*/) {
        System.out.println(id);
//        System.out.println("token:" + token);
        return id.toString();
    }


}
