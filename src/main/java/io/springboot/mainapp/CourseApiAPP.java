package io.springboot.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// This annotation is used to tell spring that from here the application starts
@SpringBootApplication
public class CourseApiAPP {
 
	public static void main(String[] args) {
		/* Here we are using a STATIC METHOD run(). it basically 
		 * performs operation of creating a servlet container and 
		 * host the spring application inside it
		 * 
		 * 2 arguments are we need to pass to the static run(1,2);
		 * 1. class which have main method
		 * 2. argument if any we need to pass to main method
		 */
		SpringApplication.run(CourseApiAPP.class, args);

	}

}
