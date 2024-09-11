package com.example.helloworldsd18403.buoi2;

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
        if(usr.equals("123") && pwd.equals("123")) {
            request.setAttribute("username", usr);
            request.setAttribute("password", pwd);
            return "buoi2/info";
        }
        request.setAttribute("error", "sai thong tin dang nhap");
        return "buoi2/login";
    }
}
