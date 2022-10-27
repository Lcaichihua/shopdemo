package com.example.shopcommerce.repository;

import com.example.shopcommerce.domain.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car,Long> {

    //List<Car> findByBrand(String brand);
    List<Car> findByBrandOrderByYearAsc(String brand);
    @Query("select c from Car c where c.brand = ?1")
    List<Car> findByBrand (String brand);
    @Query ("select c from Car c where c.brand like %?1")
    List<Car> findByBrandEndsWith(String brand);
}
