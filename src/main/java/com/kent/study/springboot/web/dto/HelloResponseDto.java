package com.kent.study.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

//롬복
@Getter //선언된 모든 필드의 get메서드를 생성
@RequiredArgsConstructor //선언된 모든 'final 필드가 포함'된 생성자를 생성
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
