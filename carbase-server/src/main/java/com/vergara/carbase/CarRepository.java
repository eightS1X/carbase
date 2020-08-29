package com.vergara.carbase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


// Class used to perform CRUD on Car entity
@RepositoryRestResource
interface CarRepository extends JpaRepository<Car, Long>{

}
