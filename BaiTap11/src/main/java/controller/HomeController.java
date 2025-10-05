package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String helloPage() {
        return "hello"; // -> hello.html
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("message", "Chào mừng bạn đã đăng nhập thành công!");
        return "hello";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // -> login.html
    }
}