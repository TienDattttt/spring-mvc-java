package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World sdgdfgdfgdfg";
    }

    @GetMapping("/user")
    public String userPage() {
        return "Hello Userrr";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Hello Adminnn";
    }
}
