package com.example.docker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {


    @GetMapping("/getdocker")
    public String getDockerText(){
        System.out.println("Controller hit");
        return "Welcome to Docker Container";
    }

}
