package com.brunoyam.demo.service;

import com.brunoyam.demo.entity.City;
import com.brunoyam.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

       public List<City> getAllWithNewPopulation() {
        List<City> list = cityRepository.findAll();
        for(City c : list) {
            c.setPopulation(c.getPopulation() * 2);
        }
        return list;

        }

        public List<City> getAllDistrict() {
           List<City> list = cityRepository.findAll();
           for(City c : list) {
               c.setDistricts(c.getDistricts());
           }
           return list;
        }

    }



