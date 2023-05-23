package co.develhope.logging.controllers;

import co.develhope.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BasicController {
    @Autowired
    BasicService basicService;
    private final Logger logger = LoggerFactory.getLogger(BasicController.class);

    @GetMapping("/")
    public String getWelcome(){
        logger.info("API: getWelcome(); send: message");
        return "Welcome user";
    }
    @GetMapping("/exp")
    public double getExp(){
        logger.info("calculate exponential...");
        return basicService.getExp();
    }
    @GetMapping("/get-errors")
    public void getErrors() throws Exception {
        logger.error("new exception generated in API getErrors()");
        throw new Exception("error");
    }
    @GetMapping("/get-errors2")
    public void getErrors2() {
        try {
            throw new Exception("error");
        }catch(Exception ex) {
            logger.error("new exception generated in API getErrors()");
        }
    }
}