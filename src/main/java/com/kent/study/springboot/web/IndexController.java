package com.kent.study.springboot.web;

import com.kent.study.springboot.service.posts.PostsService;
import com.kent.study.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("posts", postsService.findAllDesc());
        return "index"; //src/main/resources/templates/index.mustache -> 뷰리졸버가 처리
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);
        return "posts-update";
    }
}

//mustache 스타터로 컨트롤러에서 문자열 반환시 앞의 경로와 뒤의 파일 확장자는 자동으로 지정됨