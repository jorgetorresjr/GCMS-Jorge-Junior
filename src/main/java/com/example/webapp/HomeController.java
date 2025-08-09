package com.example.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World!";
	}
	
	@RequestMapping("/jorge")
	public @ResponseBody String greetingJorge() {
	return "Hello, Jorge!!!!";
	}

	@RequestMapping("/alguem")
	public @ResponseBody String greetingAlguem() {
		return "Hello, Alguém!";
	}

	@RequestMapping("/ninguem")
	public @ResponseBody String greetingNinguem() {return "Hello, Ninguém!";}
	
	@RequestMapping("/someone")
	public @ResponseBody String greetingSomeone() {return "Hello, Someone!";}

	@RequestMapping("/hotfix")
	public @ResponseBody String greetingHotfix() {return "Hello, Hotfix!";}
}
