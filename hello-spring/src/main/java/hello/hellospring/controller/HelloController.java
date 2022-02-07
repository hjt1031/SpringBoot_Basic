package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //정적방식
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello");
        //기본적으로 spring boot는 랜더링을 할때 templates 아래 html 을 찾음. return "hello" 라하면 templates > hello.html 을 랜더링
        return "hello";
    }
    //동적 MVC 방식
    // 정적, MVC 방식은 스프링 컨테이너에서 ViewResolver 에다가 토스해서 HTML 을 변환 을 한다.
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello-template";
    }
    @GetMapping("hello-string")
    //API 방섹(응답 BODY에 직접 값 을 바인딩)
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello" + name;
    }
    //API JSON 방식 => 기본객체 처리 : HttpMessageConverter (return 이 객체 면 json 방식으로 default 로 넘김(JsonConverter)).
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{
        private String name;
        //프로퍼티 접근 방식
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
