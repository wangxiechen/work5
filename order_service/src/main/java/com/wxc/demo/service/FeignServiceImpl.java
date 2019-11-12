package com.wxc.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("error")
public class FeignServiceImpl implements FeignService{

    @Override
    public String detail(Integer userid) {
        return "有问题";
    }
}
