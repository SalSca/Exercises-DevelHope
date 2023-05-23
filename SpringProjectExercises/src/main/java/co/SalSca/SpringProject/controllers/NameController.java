package co.SalSca.SpringProject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//rest è il tipo di protocollo HTTP
//il protocollo REST utilizza JSON per rappresentare gli oggetti
//con google chrome si possono fare solo le richieste GET mentre con postman tutte le tipo di richieste
//Spring usa l'inversion of control, leggendo l'annotazione @RestController (è un @Component che utilizza anche
//l'annotazione REST)
public class NameController {

    //localhost:8080/primo-metodo <- sto mappando all'indirizzo cosa deve fare
    @GetMapping("/name")
    public String getName(@RequestParam String name){
        return name;
    }
    @PostMapping("/name")
    public StringBuilder getNameReverse(@RequestParam String name){
        return new StringBuilder(name).reverse();
    }

}
