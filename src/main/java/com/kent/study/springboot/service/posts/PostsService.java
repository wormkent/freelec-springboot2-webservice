package com.kent.study.springboot.service.posts;

import com.kent.study.springboot.domain.posts.Posts;
import com.kent.study.springboot.domain.posts.PostsRepository;
import com.kent.study.springboot.web.dto.PostsResponseDto;
import com.kent.study.springboot.web.dto.PostsSaveRequestDto;
import com.kent.study.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}