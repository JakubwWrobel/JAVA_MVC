package pl.coderslab.jeespringmvc.controler.cookies;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

    @GetMapping("/setcookie/{value1}/{value2}")
    @ResponseBody
    String setCookie(HttpServletResponse response, @PathVariable String value1, @PathVariable String value2) {
        Cookie cookie = new Cookie("cookie1", value1);
        Cookie cookie2 = new Cookie("cookie2", value2);
        cookie.setMaxAge(30);
        cookie2.setMaxAge(30);
        cookie.setPath("/");
        cookie2.setPath("/");

        response.addCookie(cookie);
        response.addCookie(cookie2);
        return "";
    }

    @GetMapping("/getcookies")
    @ResponseBody
    String getCookie(@CookieValue("cookie1") String value, @CookieValue("cookie2") String value2) {
        return value + " : " + value2;
    }
}
