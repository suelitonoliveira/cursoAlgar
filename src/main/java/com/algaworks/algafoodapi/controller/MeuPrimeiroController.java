package com.algaworks.algafoodapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuPrimeiroController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "aaaa!";
    }
}
