package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
   - 스프링 빈을 등록 하는 2가지 방법
    1. 컴포넌트 스캔과 자동 의존관계 설정(아래 Autowired 가 예시) => 스프링 컨테이너에 연결 해주는 작업 => @Service, @Repository, @Autowired
    2. 자바 코드로 직접 스프링 빈 등록하기

   - 컴포넌트 스캔과 자동 의존관계 설정
    1. @Conponent 애노테이션이 있으면 스프링 빈으로 자동 등록됨(@Autowired 안에 @Conponent 가 들어가 있다)

 */

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    //회원 웹 기능 - 등록
    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }
}
