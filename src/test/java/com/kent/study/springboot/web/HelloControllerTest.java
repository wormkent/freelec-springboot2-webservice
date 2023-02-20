package com.kent.study.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;
    //스프링 MVC 테스트의 시작점
    //이 클래스 통해 HTTP GET,POST 등에 대한 API 테스트 가능

    @Test
    public void hello가_리턴된다() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello")) //MocMvc 통해 /hello 주소로 HTTP GET 요청을 함
                .andExpect(status().isOk()) //mvc.perform의 결과 검증, HTTP Header의 status를 검증
                .andExpect(content().string(hello)); //mvc.perform의 결과 검증, Controller에서 "hello"를 반환하기 때문에 이 값이 맞는지 검증
    }
}
