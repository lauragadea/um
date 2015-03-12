package hello.controller;

import hello.Sum;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {
    
    @RequestMapping("/sum")
    public Sum suma(@RequestParam(value="num1") long num1, @RequestParam(value="num2") long num2){
    	Sum sum = new Sum (num1,num2);
    	sum.sumar(num1, num2);
    	return sum;
    }

}



