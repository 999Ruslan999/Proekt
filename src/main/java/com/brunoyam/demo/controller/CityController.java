package com.brunoyam.demo.controller;

import com.brunoyam.demo.entity.City;
import com.brunoyam.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;


    @RequestMapping("/hello")
    String hello() {
        return "Hello, world";
    }

    @RequestMapping("/listNew")
    List<City> listNew() {
       return cityService.getAllWithNewPopulation();
    }

    @RequestMapping("/listOld")
    String hello1() {
        return "Hello, word";
    }
}
