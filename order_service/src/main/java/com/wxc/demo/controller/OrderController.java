package com.wxc.demo.controller;

import com.wxc.demo.service.FeignService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private FeignService feignService;

    @RequestMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer orderid){
        String username = feignService.detail(orderid);
        return "这是"+username+"的订单";
    }
}
