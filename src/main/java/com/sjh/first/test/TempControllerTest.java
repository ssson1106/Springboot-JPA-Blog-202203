package com.sjh.first.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//Controller 어노테이션은 기본적으로 파일을 리턴하도록 한다.
//리턴 파일 기본 경로 : /src/main/resources/static
public class TempControllerTest {

	@GetMapping("/temp/home")
	public String tempHome() {
		return "/home.html";
	}
	
	@GetMapping("/temp/jsp")
	public String tempJsp() {
		return "test";
	}
}
