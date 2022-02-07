package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello");
        //기본적으로 spring boot는 랜더링을 할때 templates 아래 html 을 찾음. return "hello" 라하면 templates > hello.html 을 랜더링
        return "hello";
    }
}
