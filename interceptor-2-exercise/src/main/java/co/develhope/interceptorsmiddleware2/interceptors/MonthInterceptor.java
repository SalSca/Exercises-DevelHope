package co.develhope.interceptorsmiddleware2.interceptors;

import co.develhope.interceptorsmiddleware2.entities.Month;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class MonthInterceptor implements HandlerInterceptor {
    private static final List<Month> months = new ArrayList<>();

    public MonthInterceptor() {
        months.add(new Month(1, "January", "Gennaio", "Januar"));
        months.add(new Month(2, "February", "Febbraio", "Februar"));
        months.add(new Month(3, "March", "Marzo", "März"));
        months.add(new Month(4, "April", "Aprile", "April"));
        months.add(new Month(5, "May", "Maggio", "Mai"));
        months.add(new Month(6, "June", "Giugno", "Juni"));
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        Optional<String> monthNumberStringOpt = Optional.ofNullable(request.getHeader("monthNumber"));
        if (monthNumberStringOpt.isEmpty() || monthNumberStringOpt.get().equals("")) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,"MonthNumber Header is missing or empty");
            return false;
        }
        int monthNumber = Integer.parseInt(monthNumberStringOpt.get());
        Optional<Month> monthOpt = months.stream()
                .filter(m -> m.getMonthNumber() == monthNumber)
                .findFirst();
        if (monthOpt.isPresent()) {
            request.setAttribute("month", monthOpt.get());
        } else {
            Month emptyMonth = new Month(monthNumber, "nope", "nope", "nope");
            request.setAttribute("month", emptyMonth);
        }
        return true;
    }

}