package co.develhope.interceptorsmiddleware2.controllers;

import co.develhope.interceptorsmiddleware2.entities.Month;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
public class MonthController {

    @GetMapping("/months")
    public Month getMonth(HttpServletRequest request) throws Exception {
        Optional<String> monthNumber = Optional.ofNullable(request.getHeader("monthNumber"));
        return (Month) request.getAttribute("month");
    }

}