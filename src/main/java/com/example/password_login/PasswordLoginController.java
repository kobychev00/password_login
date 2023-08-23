package com.example.password_login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordLoginController {

    @GetMapping
    public String welcome() {
        return "get ready to introduce yourself";
    }
}

