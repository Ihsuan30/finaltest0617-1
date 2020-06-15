package com.example.finaltest0617.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
public class finalcontroller {

    @GetMapping(value = "/choose/0")
    public LinkedHashMap<String, Object> choose1() {

        LinkedHashMap<String, Object> map = new LinkedHashMap<>();

        int random=(int) (Math.random() * 3);

        map.put("value",random);
        map.put("type", 0);

        return map;

    }
    @GetMapping(value ="/choose/1")
    public LinkedHashMap<String, Object> choose2() {

        LinkedHashMap<String, Object> map = new LinkedHashMap<>();

        int random=(int) (Math.random() * 3);
        map.put("value",random);
        map.put("type", 1);

        return map;

    }

    @GetMapping(value ="/choose/2")
    public LinkedHashMap<String, Object> choose3() {

        LinkedHashMap<String, Object> map = new LinkedHashMap<>();

        int random=(int) (Math.random() * 3);
        map.put("value",random);
        map.put("type", 2);

        return map;

    }

}
