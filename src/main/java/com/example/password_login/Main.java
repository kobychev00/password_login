package com.example.password_login;

public class Main {
    public static void main(String[] args) {
        boolean result = ValidateService.validate("testK",
                                               "dfghjklkjhgf23",
                                          "dfghjklkjhgf23");
        if (result) {
            System.out.println("Логин и пароль корректны");
        }
    }
}
