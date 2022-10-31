package com.example.shopcommerce;

import com.example.shopcommerce.domain.Car;
import com.example.shopcommerce.domain.Owner;
import com.example.shopcommerce.domain.User;
import com.example.shopcommerce.repository.CarRepository;
import com.example.shopcommerce.repository.OwnerRepository;
import com.example.shopcommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShopcommerceApplication {

	@Autowired
	private CarRepository carRepository;
	@Autowired
	private OwnerRepository ownerRepository;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(ShopcommerceApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(){
		return args ->{
			Owner owner1 = new Owner ("John" , "Johnson");
			Owner owner2 = new Owner ("Mary","Robinson");

			ownerRepository.save(owner1);
			ownerRepository.save(owner2);
			carRepository.save (new Car(  "Ford",  "Mustang", "Red","ADF-1121",  2017,  59000, owner1));
			carRepository. save (new Car ( "Nissan",  "Leaf",  "White" , "SSJ-3002",  2014,  29000, owner2));
			carRepository. save (new Car ("Toyota",  "Prius",  "Silver", "KKO-0212", 2018,  39000, owner2));
			//User
			userRepository.save(new User("user","$2a$04$HrgaAw.fNLK21MBRV9b2Ie/F/Fq5gnCRDfbvxr9Ig.UsB7mfjJ1fe","USER"));
			userRepository.save(new User("admin","$2a$04$lZBn80LY1z8qcWmvpEgmmu3EsRbQDUi/4lP9g.WL1S4LcixHhpN6a","ADMIN"));


		};
}
}
