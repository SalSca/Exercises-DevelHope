package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicController  {

    @GetMapping("")
    public int randomNumber() {
        Random rnd = new Random();
        return rnd.nextInt(10) + rnd.nextInt(10);
    }
}