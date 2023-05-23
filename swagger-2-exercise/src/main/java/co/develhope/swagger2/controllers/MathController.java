package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("")
    @ApiOperation(value = "Welcome message", notes = "Returns a welcome message for the /math endpoint.")
    public String welcomeMathMsg() {
        return "Welcome to Math Controller";
    }

    @GetMapping("/division-info")
    @ApiOperation(value = "Division info", notes = "Returns an ArithmeticOperation object that contains details about the division operation.")
    public ArithmeticOperation divisionInfo(@RequestParam(name="dividend") double dividend, @RequestParam(name="divisor") double divisor){
        double different = dividend % divisor;
        double result= dividend/divisor;
        double minOperand;
        if(dividend > divisor){
            minOperand=divisor;
        }else{
            minOperand=dividend;
        }
        String description = dividend+" + "+divisor+" = "+result + "/n different is "+different;
        String[] properties= {"Commutativa","Associativa","Distributiva","Inversa","Identità","Esistenza del limite"};
        return new ArithmeticOperation("division",(int) minOperand,description,properties);
    }

    @GetMapping("/multiplication")
    @ApiOperation(value = "Multiplication", notes = "Multiplies two integer values together and returns the result.")
    public int multiplicationOperation(@RequestParam int factor1, @RequestParam int factor2){
        return factor1 * factor2;
    }

    @GetMapping("/square/{n}")
    @ApiOperation(value = "Square", notes = "Calculates the square of a double value.")
    public double squareOperation(@PathVariable double n){
        return Math.pow(n,2);
    }
}

