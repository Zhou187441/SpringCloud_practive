package com.study.springboot;

import com.study.springboot.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class junitTest {

    @Autowired
    private Person person;

    @Test
    public void test(){
        System.out.println(person);
    }
}
