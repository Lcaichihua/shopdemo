package com.example.shopcommerce.web;

import com.example.shopcommerce.domain.Car;
import com.example.shopcommerce.repository.CarRepository;
import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    @Autowired
    private CarRepository repository;

    @RequestMapping(value = "/cars",method = RequestMethod.GET)
    public Iterable<Car> getCars(){
        return repository.findAll();

}
}
