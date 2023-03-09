package Christofer.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name,
						@RequestParam(value = "surname",required = false) String surname) {
		return String.format("HelloGet %s %s!", name,surname);
	}
	@PostMapping("/hello")
	public String postHello(@RequestParam(value = "name", defaultValue = "World") String name,
						@RequestParam(value = "surname",required = false) String surname) {
		return String.format("HelloPost %s %s!", name,surname);
	}
	@PutMapping("/hello")
	public String putHello(@RequestParam(value = "name", defaultValue = "World") String name,
							@RequestParam(value = "surname",required = false) String surname) {
		return String.format("HelloPut %s %s!", name,surname);
	}
}
