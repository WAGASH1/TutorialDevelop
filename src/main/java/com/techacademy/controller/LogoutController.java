package com.techacademy.controller;

import org.springframework.web.bind.annotation.PostMapping;

public class LogoutController {

    /** ログアウト処理 */
    @PostMapping("/logout")
    public String postLogout() {
        //　ログイン画面へ
        return "redirect:/login";
    }

}
