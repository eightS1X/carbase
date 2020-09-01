package com.vergara.carbase;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class CarController {
    private CarRepository repository;

    // Set to repository that's passed in
    public CarController(CarRepository repository){
        this.repository = repository;
    }

    // Return all cars from repository
    @GetMapping("/all-cars")
    public Collection<Car> getAllCars() {
        return repository
                .findAll()
                .stream()
                .collect(Collectors.toList());
    }

    // Return "cool"" cars from repository
    @GetMapping("/cool-cars")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<Car> coolCars() {
        return repository
                .findAll()
                .stream()
                .filter(this::isCool)
                .collect(Collectors.toList());
    }

    // Boolean-based filtration method
    private boolean isCool(Car car) {
        return !car.getName().equals("AMC Gremlin") &&
                !car.getName().equals("Triumph Stag") &&
                !car.getName().equals("Ford Pinto") &&
                !car.getName().equals("Yugo GV");
    }
}
