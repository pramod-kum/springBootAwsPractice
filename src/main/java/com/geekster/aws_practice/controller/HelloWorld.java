package com.geekster.aws_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
public class HelloWorld {

        @GetMapping("/home")
        public Map<String,String> home(){
            Map<String,String> map =new HashMap<>();
            map.put("Pramod","home");
            return map;
        }
        @GetMapping(value = "/world2")
        public Map<String,String> helloWord2() {
            Map<String, String> map = new HashMap<>();
            map.put("Pramod", "HelloWorld2");
            return map;

    }
}
