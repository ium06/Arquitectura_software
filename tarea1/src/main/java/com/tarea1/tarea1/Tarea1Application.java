package com.tarea1.tarea1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class Tarea1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tarea1Application.class, args);
	}

	@GetMapping("/Hello")
	public String Hello(@RequestParam(value = "name", defaultValue = "World" ) String name) {
		return String.format ("Hellow %s!", name);
	}


}
