package com.kent.study.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//주요 어노테이션을 클래스와 가깝게 둔다.
@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity{ //JPA Auditing 어노테이션을 활성화할 수 있게됨.

    //JPA를 사용하면 DB 데이터에 쿼리를 날리기보다 Entity 클래스 수정을 통해 작업한다.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}