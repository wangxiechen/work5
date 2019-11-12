package com.wxc.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@FeignClient(value = "user-service",fallback = FeignServiceImpl.class)
public interface FeignService {
    @RequestMapping("/detail")
    String detail(@RequestParam("id") Integer userid);
}
