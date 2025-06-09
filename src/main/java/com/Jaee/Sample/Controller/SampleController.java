package com.Jaee.Sample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class SampleController {

    @GetMapping
    public String home(){
        return "Welcome to first deployment of Spring to Ec2";
    }

}
