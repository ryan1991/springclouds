package com.junbao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonController {


    @RequestMapping("/allPersons")
    public List<Person> allPersons(){
        return Arrays.asList(new Person(1L, "张三"),
                new Person(1L, "李四"));

    }

}
