package co.SalSca.SpringProject.controllers;

import co.SalSca.SpringProject.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService){
        this.myService=myService;

    }
    @GetMapping("/getName")

    public String getName() {
        return myService.getName();
    }

    @GetMapping("/")
    public String welcome(){
        return "welcome to my app";
    }
}
