package br.com.teste.cloudClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/rest")
@RestController
public class clientController {

    @Value("${test.url}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return  message;
    }

}
