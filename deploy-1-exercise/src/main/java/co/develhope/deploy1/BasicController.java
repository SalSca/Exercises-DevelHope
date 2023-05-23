package co.develhope.deploy1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController{

    @Value("${myCustomEnvs.devName}")
    private String devName;

    @GetMapping("/get-dev-name")
    public String getDevName(){
        return devName;
    }
}