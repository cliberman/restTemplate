package com.example.demo.controller;

import com.example.demo.service.RestTemplateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/restTemplate")
public class RestTemplateController {
    @PostMapping("/getNum")
    public String getNum(@RequestBody int num) {
        return RestTemplateService.getNum(num);
    }
}
