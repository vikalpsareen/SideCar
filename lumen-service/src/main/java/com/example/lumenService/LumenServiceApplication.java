package com.example.lumenService;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class LumenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LumenServiceApplication.class, args);
	}
	
	

}

@RestController()
class main{
	@GetMapping("/health")
	@ResponseBody
    public Map<String, String> healthCheck() {
		  HashMap<String, String> map = new HashMap<>();
		    map.put("status", "UP");
		    return map;
	}
}
