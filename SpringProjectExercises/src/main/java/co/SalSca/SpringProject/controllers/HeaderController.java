package co.SalSca.SpringProject.controllers;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/headers")
public class HeaderController {

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/getHeader")
    public String getHeaders(@RequestHeader("host") String host) {
        String hostName = request.getLocalName();
        int hostPort = request.getLocalPort();
        return "Host name: " + hostName + "\nHost port: " + hostPort;
    }
}
