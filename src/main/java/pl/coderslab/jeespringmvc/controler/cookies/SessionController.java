package pl.coderslab.jeespringmvc.controler.cookies;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class SessionController {

    @GetMapping("/checkCookie")
    @ResponseBody
    String checkCookie(HttpServletRequest http, HttpServletResponse httpsRes) {
        Cookie c = WebUtils.getCookie(http, "loginStart");
        if (c == null) {
            LocalDateTime now = LocalDateTime.now();
            String s = now.toString();
            Cookie cookie = new Cookie("loginStart", s);

            //Setup of Cookie for path and response
            cookie.setPath("/checkCookie");
            httpsRes.addCookie(cookie);

            return cookie.getValue();
        }
        return c.getValue();
    }


    @GetMapping("/zad1")
    @ResponseBody
    public String zad1(HttpSession ses){
        LocalDateTime loginStart = (LocalDateTime) ses.getAttribute("loginStart");
        if(loginStart == null){
            loginStart = LocalDateTime.now();
            ses.setAttribute("loginStart", loginStart);
            return "Ustawiono wartość";
        }
        return loginStart.toString();
    }
}
