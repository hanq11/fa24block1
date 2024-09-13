package com.example.helloworldsd19202.buoi2;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/buoi2")
public class LoginController {
    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String showLogin() {
        return "buoi2/login";
    }

//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(HttpServletRequest request) {
//        String usr = request.getParameter("username");
//        String pwd = request.getParameter("password");
//        if(usr.equals("123") && pwd.equals("abc")) {
//            request.setAttribute("username", usr);
//            request.setAttribute("password", pwd);
//            return "buoi2/info";
//        }
//        request.setAttribute("error", "thong tin dang nhap sai");
//        return "buoi2/login";
//    }

    // Su dung @RequestParam de viet controller Post
//    @PostMapping("/login")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        Model model) {
//        if(username.equals("123") && password.equals("abc")) {
//            model.addAttribute("username", username);
//            model.addAttribute("password", password);
//            return "buoi2/info";
//        }
//        model.addAttribute("error", "thong tin dang nhap sai");
//        return "buoi2/login";
//    }

    // Su dung java bean de viet controller Post
    @PostMapping("/login")
    public String login(LoginRequest loginRequest
                        , @RequestParam(name = "remember", defaultValue = "false") boolean remember
                        , Model model
                        , HttpServletResponse response) {
        if(loginRequest.getUsername().equals("123") && loginRequest.getPassword().equals("123")) {
            model.addAttribute("username", loginRequest.getUsername());
            model.addAttribute("password", loginRequest.getPassword());
            Cookie ckiUsr = new Cookie("usr", loginRequest.getUsername());
            Cookie ckiPwd = new Cookie("pwd", loginRequest.getPassword());

            int expiry = 0;
            if(remember == true) {
                expiry = 24 * 60 * 60 * 3;
            }
            ckiUsr.setMaxAge(expiry);
            ckiPwd.setMaxAge(expiry);
            response.addCookie(ckiUsr);
            response.addCookie(ckiPwd);
            return "buoi2/info";
        }
        model.addAttribute("error", "thong tin dang nhap sai");
        return "buoi2/login";
    }

    @GetMapping("/readCookie")
    public String readCookie(@CookieValue("usr") String username
            , @CookieValue("pwd") String password, Model model) {
        model.addAttribute("usr", username);
        model.addAttribute("pwd", password);
        return "buoi2/info";
    }
}
