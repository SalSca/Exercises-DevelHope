package co.develhope.customqueries1.controllers;

import co.develhope.customqueries1.entities.Flight;
import co.develhope.customqueries1.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    FlightRepository flightRepository;


    @GetMapping("/getAllFlights")
    public List<Flight> allFlights(){
        return flightRepository.findAll();
    }

    @GetMapping("/FlightsProvisioning")
    public String FlightsProvisioning(){
        Random random=new Random();
        int streamSize = 20;
        for(int i=0;i<50;i++){
            flightRepository.save(new Flight(rndSTR(), rndSTR(), rndSTR()));
        }
        return "Sono stati inseriti 50 voli nel db";
    }

    private String rndSTR(){
        Random random = new Random();
        return random.ints(7, 97, 123)
                              .collect(
                                      StringBuilder::new,
                                      StringBuilder::appendCodePoint,
                                      StringBuilder::append
                              ).toString();
    }

}