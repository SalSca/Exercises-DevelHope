package co.develhope.logging.services;

import co.develhope.logging.controllers.BasicController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BasicService {
    private final Logger logger = LoggerFactory.getLogger(BasicService.class);
    @Value("${customEnvs.n1}")
    int num1;
    @Value("${customEnvs.n2}")
    int num2;
    public double getExp() {
        double exp = Math.pow(num1,num2);
        logger.info("calculate done");
        return exp;
    }
}