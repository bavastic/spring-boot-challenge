package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Feel free to define new classes when you need them.
 *
 * Clean Structure is important.
 *
 * Design your code for easy testability.
 *
 * Ensure proper Error Handling.
 *
 * Sketch how you would test your code.
 *
 * The CalculatorController should provide a simple HTTP based Interface.
 * You can send 2 numbers and an operation, the controller should do the calculation.
 * Or delegate to a class, which can do it.
 *
 * The Controller should:
 *
 * accept POST Requests
 * accept URLs like "/calc/MULT?a=2&b=3"
 *
 * If you are done, we should be able to:
 *
 * start the application
 * verify the functionality via cURL
 *
 * Alternatively, you can provide a Unit Test that ensures the HTTP Call works as expected.
 *
 * Example:
 * curl -XPOST localhost:9091/calc/MULT?a=2\&b=3
 *
 * should provide
 *
 * {
 *     "result" : 6
 * }
 *
 * Good luck.
 *
 */
enum  Operation {
	ADD,
	MINUS,
	MULT,
	DIV
}

class Result {
}

//make this a Controller
class CalculatorController {

	// make this a http post endpoint using /calc/{operation} accepting http request parameter ?a=1&b=2
	// example: /calc/MULT?a=2&b=3 => 6
	public Result calculate(Operation operation, int a, int b) {
		//do the calculation (make sure it is testable)
		return new Result();
	}
}
@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

}
