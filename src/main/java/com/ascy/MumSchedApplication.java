package com.ascy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@SpringBootApplication
public class MumSchedApplication {

	public static void main(String[] args) {
		SpringApplication.run(MumSchedApplication.class, args);
	}
	
//	@RestController 
	@Controller
	public class HomeContoller {
	    @RequestMapping("/")
	    public String index() {
	        return "home";
	    }
	    @RequestMapping("/home")
	    public String home() {
	        return "home";
	    }
	}
}
