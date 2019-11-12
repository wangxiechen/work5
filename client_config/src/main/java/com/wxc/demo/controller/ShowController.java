package com.wxc.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/show")
public class ShowController {
    @Value("${env_name}")
    private String envName;

    @RequestMapping("/env")
    public String showEnv(){
        return envName;
    }
}
