package com.brunoyam.demo.repository;

import com.brunoyam.demo.entity.City;
import com.brunoyam.demo.entity.District;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CityRepository {

    public List<City> findAll() {
        List<City> list = new ArrayList<>();
        list.add(new City(323L, "London", 1_500_000, new ArrayList<>(Arrays.asList(new District("Centry"), new District("Bruklin")))));
        list.add(new City(123L,"Paris",2_000_000, new ArrayList<>(Arrays.asList(new District("NewOrk"), new District( "Chicago")))));
        list.add(new City(125L, "Moscow", 15_000_000, new ArrayList<>(Arrays.asList(new District("Pecin"), new District("Tokio")))));
        return list;

    }


}
