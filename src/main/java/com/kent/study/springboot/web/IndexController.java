package com.kent.study.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index"; //src/main/resources/templates/index.mustache -> 뷰리졸버가 처리
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }
}

//mustache 스타터로 컨트롤러에서 문자열 반환시 앞의 경로와 뒤의 파일 확장자는 자동으로 지정됨