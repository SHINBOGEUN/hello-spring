package hello.hellospring.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("Hello")
    public String hello(Model model) {
        model.addAttribute("data","hello!!");
        return "Hello!!";
    }

}
