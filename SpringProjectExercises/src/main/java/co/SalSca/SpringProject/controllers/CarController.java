package co.SalSca.SpringProject.controllers;

import co.SalSca.SpringProject.entities.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    List<CarDTO> carDTOList = new ArrayList<>();

    @GetMapping("/newCar")
    public CarDTO newCar(@RequestParam int id, @RequestParam String modelName, @RequestParam(required = false,defaultValue = "0") double price){
        CarDTO newCar = new CarDTO();
        newCar.setId(id);
        newCar.setModelName(modelName);
        newCar.setPrice(price);
        carDTOList.add(newCar);
        return newCar;
    }

    @PostMapping("/carList")
    public ResponseEntity<String> carList(){
        System.out.println(carDTOList.toString());
        return ResponseEntity.status(HttpStatus.CREATED).body("Car creata con successo!");
    }
}
