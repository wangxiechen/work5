package com.wxc.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/detail")
    public String detail(@RequestParam("id") Integer userid){
        Map<String, String> map = new HashMap<>();
        int i = 10/userid;
        map.put("1","安吉");
        map.put("2","小胖");
        map.put("3","可乐");
        return map.get(String.valueOf(userid));
    }
}
