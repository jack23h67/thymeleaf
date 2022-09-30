package com.example.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ThymeleafController {

	@GetMapping("/home")
	public String home(Model model) {
		Student st = new Student();
		st.setId(1);
		st.setName("Judy");
		
		model.addAttribute("myStudent", st);
		
		return "index";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/login")
    public String login(String userName,
                        String userPassword) {

        System.out.println("userName 為: " + userName);
        System.out.println("userPassword 為: " + userPassword);

        return "login";
    }
}
