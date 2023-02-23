package com.kent.study.springboot.web;

import com.kent.study.springboot.service.posts.PostsService;
import com.kent.study.springboot.web.dto.PostsResponseDto;
import com.kent.study.springboot.web.dto.PostsSaveRequestDto;
import com.kent.study.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postService.save(requestDto);
    }
}