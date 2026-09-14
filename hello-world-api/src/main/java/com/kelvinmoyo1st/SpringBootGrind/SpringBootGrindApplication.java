// Defines the package this class belongs to.
package com.kelvinmoyo1st.SpringBootGrind;

// Imports the class that starts a Spring Boot application.
import org.springframework.boot.SpringApplication;
// Imports the annotation that enables Spring Boot auto-configuration.
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Marks this class as the main Spring Boot application.
@SpringBootApplication
// Defines the application class.
public class SpringBootGrindApplication {

	// Defines the starting point of the Java application.
	public static void main(String[] args) {

		// Creates an instance of the HelloController.
		HelloController helloController = new HelloController();
		// Stores the controller's returned HTML in a String.
		String helloMessage = helloController.hello();
		// Stores the controller's random integer result.
		int randomNumber = helloController.randomNumber();
		// Starts the Spring Boot application.
		SpringApplication.run(SpringBootGrindApplication.class, args);
	}
}
