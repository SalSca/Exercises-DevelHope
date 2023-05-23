package co.SalSca.SpringProject.controllers;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/strings")
public class StringController {

    @GetMapping("/concatenateString")
    public String concatenateStrings(@RequestParam String first, @RequestParam(required = false) String second) {
        if (second != null) {
            return first + " " + second;
        } else {
            return first;
        }
    }
}
