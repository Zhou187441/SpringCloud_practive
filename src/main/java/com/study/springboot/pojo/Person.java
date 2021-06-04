package com.study.springboot.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "person")
@Component
public class Person {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String birth;
}
