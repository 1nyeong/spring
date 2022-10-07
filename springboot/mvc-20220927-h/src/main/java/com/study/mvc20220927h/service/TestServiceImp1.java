package com.study.mvc20220927h.service;

import com.study.mvc20220927h.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ts1")
public class TestServiceImp1 implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public void logic1() {
        System.out.println("테스트1클래스에서 logic1 메소드 실행");
        testRepository.insert();
    }

    @Override
    public void logic2() {
        System.out.println("테스트1클래스에서 logic2 메소드 실행");
        testRepository.select();
    }
}
