package com.example.helloworldsd18403.buoi2;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/buoi2")
public class LoginController {
    //Cach 2: @GetMapping("/login")
    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String showLogin() {
        return "buoi2/login";
    }

    //Cach 2: @PostMapping("/login")
//    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
//    public String login(HttpServletRequest request) {
//        String usr = request.getParameter("username");
//        String pwd = request.getParameter("password");
//        if(usr.equals("123") && pwd.equals("123")) {
//            request.setAttribute("username", usr);
//            request.setAttribute("password", pwd);
//            return "buoi2/info";
//        }
//        request.setAttribute("error", "sai thong tin dang nhap");
//        return "buoi2/login";
//    }

//    @PostMapping("/login")
//    public String login(@RequestParam("username") String usr
//            , @RequestParam("password") String pwd
//            , Model model) {
//        if(usr.equals("123") && pwd.equals("123")) {
//            model.addAttribute("username", usr);
//            model.addAttribute("password", pwd);
//            return "buoi2/info";
//        }
//        model.addAttribute("error", "sai thong tin dang nhap");
//        return "buoi2/login";
//    }

    @PostMapping("/login")
    public String login(LoginRequest loginRequest, Model model
            , @RequestParam(name = "remember", defaultValue = "false") boolean remember
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
        model.addAttribute("error", "sai thong tin dang nhap");
        return "buoi2/login";
    }

    @GetMapping("/readCookie")
    public String readCookie(@CookieValue("usr") String usr, @CookieValue("pwd") String pwd, Model model) {
        model.addAttribute("usr", usr);
        model.addAttribute("pwd", pwd);
        return "buoi2/info";
    }
}
