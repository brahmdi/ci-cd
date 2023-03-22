package com.test.gitcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitcicdApplication {

    @GetMapping("/")
    public String home(){
        return "hello , this is your custom image !" ;
    }

    public static void main(String[] args) {
        SpringApplication.run(GitcicdApplication.class, args);
    }

}
