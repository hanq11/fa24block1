package com.example.helloworldsd19202.buoi2;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping(value = {"/buoi2/login"}, method = RequestMethod.GET)
    public String showLogin() {
        return "buoi2/login";
    }
    @RequestMapping(value = {"/buoi2/login"}, method = RequestMethod.POST)
    public String login(HttpServletRequest request) {
        String usr = request.getParameter("username");
        String pwd = request.getParameter("password");
        if(usr.equals("123") && pwd.equals("abc")) {
            request.setAttribute("username", usr);
            request.setAttribute("password", pwd);
            return "buoi2/info";
        }
        request.setAttribute("error", "thong tin dang nhap sai");
        return "buoi2/login";
    }
}
