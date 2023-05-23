package co.develhope.springrepositories1.repositories;

import co.develhope.springrepositories1.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CarRepository extends PagingAndSortingRepository<Car, Long> {}
