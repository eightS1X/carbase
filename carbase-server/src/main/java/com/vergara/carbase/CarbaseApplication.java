package com.vergara.carbase;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

@SpringBootApplication
public class CarbaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarbaseApplication.class, args);
	}

	// Fill repository with sample data via Stream, display output
	@Bean
	ApplicationRunner init(CarRepository repository) {
		return args -> {
//			Initialize repo with data (does not yet persist)
			Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti", "AMC Gremlin",
					"Triumph Stag", "Ford Pinto", "Yugo GV")
					.forEach(name -> {
						Car car = new Car();
						car.setName(name);
						repository.save(car);
					});
			repository.findAll().forEach(System.out::println);
		};
	}
}
