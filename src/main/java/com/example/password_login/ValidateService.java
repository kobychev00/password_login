package com.example.password_login;

import org.jetbrains.annotations.NotNull;

public class ValidateService {

    public ValidateService () {
    }

    public static boolean validate(String login,
                                String password,
                                String repeatPassword) {
        try {
            check(login, password, repeatPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void check (String login,
                              String password,
                              String repeatPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || login.length() > 20) {
            throw new WrongLoginException("Длина логина должна быть меньше или равна 20");
        }
        if (password == null || password.length() > 20) {
            throw new WrongPasswordException("Длина пароля должна быть меньше или равно 20");
        }
        if (!password.equals(repeatPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }

        regularWay(login, true);
        regularWay(password, false);

    }
/*
Регулярное выражение ^\\w+$ в Java используется для проверки строки на
соответствие следующим условиям:

^ - Соответствие должно начинаться с начала строки.
\\w+ - Это означает, что должны присутствовать один или более символов слова
(буквы, цифры или символ подчеркивания).
\w - это метасимвол, представляющий символы слова.
$ - Соответствие должно заканчиваться в конце строки.

Таким образом, ^\\w+$ проверяет, что вся строка состоит только из букв, цифр и/или
символов подчеркивания и не содержит других символов или пробелов.

 */
    public static void regularWay(@NotNull String string, boolean login)
        throws WrongLoginException, WrongPasswordException {
        if (!string.matches("^\\w+$")) {
            throw new WrongLoginException("В логине есть некорректный символ");
        }
        if (!string.matches("^\\w+$")) {
            throw new WrongPasswordException("В пароле есть некорректный символ");
        }
    }
}
