package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String helloPage() {
        return "hello";
    }

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("message", "Đăng nhập thành công! Dữ liệu lấy từ Database.");
        return "hello";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}