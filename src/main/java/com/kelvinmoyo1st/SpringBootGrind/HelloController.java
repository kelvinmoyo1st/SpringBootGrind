// Defines the package this class belongs to.
package com.kelvinmoyo1st.SpringBootGrind;

// Imports the class used to generate random numbers.
import java.util.Random;
// Imports the annotation that maps HTTP GET requests to methods.
import org.springframework.web.bind.annotation.GetMapping;
// Imports the annotation that marks this class as a REST controller.
import org.springframework.web.bind.annotation.RestController;

// Registers this class as a Spring REST controller.
@RestController
// Defines the controller class.
public class HelloController {

	// Maps GET requests for /hello to this method.
	@GetMapping("/hello")
	// Defines a method that returns text to the caller.
	public String hello() {
		// Returns Hello World inside an HTML heading.
		return "<h1>Hello World</h1>";
	}

	// Maps GET requests for /random to this method.
	@GetMapping("/random")
	// Defines a method that returns a random integer.
	public int randomNumber() {
		// Creates a random number generator.
		Random random = new Random();
		// Generates and returns a random integer.
		return random.nextInt();
	}
}