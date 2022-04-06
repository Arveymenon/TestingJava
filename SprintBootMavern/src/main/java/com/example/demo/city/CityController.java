package com.example.demo.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path="api/v1/cities")
public class CityController {

    @Autowired
    public CityController(){
        this.getName();
    }

    public String getName(){
        System.out.println("-----------------Autowired City Controller-------------------------");
        return "Mumbai";
    }


}
