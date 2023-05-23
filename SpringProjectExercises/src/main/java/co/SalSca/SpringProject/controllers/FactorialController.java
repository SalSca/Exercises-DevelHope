package co.SalSca.SpringProject.controllers;

import co.SalSca.SpringProject.services.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {
    @Autowired
    FactorialService f;

    @GetMapping("/factorial")
    public int getFactorial(@RequestParam int n){
        return f.factorial(n);
    }
}
