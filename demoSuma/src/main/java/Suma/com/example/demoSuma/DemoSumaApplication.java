package Suma.com.example.demoSuma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoSumaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSumaApplication.class, args);
	}
	@GetMapping("/suma")
	public String getSuma(@RequestParam(value = "primerNum", defaultValue = "0") int primerNum,
						  @RequestParam(value = "segonNum", defaultValue = "0") int segonNum) {

		return  String.valueOf(primerNum + segonNum);
	}
	@PostMapping("/suma")
	public String postSuma(@RequestParam(value = "primerNum", defaultValue = "0") int primerNum,
					       @RequestParam(value = "segonNum", defaultValue = "0") int segonNum) {

		return  String.valueOf(primerNum + segonNum);
	}
	@PutMapping("/suma")
	public String putSuma(@RequestParam(value = "primerNum", defaultValue = "0") int primerNum,
						  @RequestParam(value = "segonNum", defaultValue = "0") int segonNum) {

		return  String.valueOf(primerNum + segonNum);
	}

}
