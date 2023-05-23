package co.develhope.customqueries2.repositories;

import co.develhope.customqueries2.entities.Flight;
import co.develhope.customqueries2.entities.FlightStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    Page<Flight> findAllByStatus(FlightStatus status, PageRequest of);
    @Query("SELECT f FROM Flight f WHERE f.status = :p1 OR f.status = :p2 ORDER BY f.fromAirport ASC")
    List<Flight> getCustomFlight(@Param("p1") FlightStatus p1, @Param("p2") FlightStatus p2);
}