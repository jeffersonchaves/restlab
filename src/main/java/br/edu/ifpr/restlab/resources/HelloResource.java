package br.edu.ifpr.restlab.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloResource {
    

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false, defaultValue = "teste") String param) {
        return "Hello World" + param;
    }
    

}
