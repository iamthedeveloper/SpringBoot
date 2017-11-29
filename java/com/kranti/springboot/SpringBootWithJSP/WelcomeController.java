package com.kranti.springboot.SpringBootWithJSP;
import java.util.Calendar;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${greeting.message:test}")
	private String greet = "Greeting!";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("greeting", this.greet +" : "+ Calendar.getInstance().getTime());
		return "greet";
	}

}