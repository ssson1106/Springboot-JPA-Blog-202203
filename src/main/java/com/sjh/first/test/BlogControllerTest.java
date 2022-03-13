package com.sjh.first.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
/* 스프링이 com.sjh.first 패지키 이하를 스캔해서
 * 특정 어노테이션이 붙어있는 클래스를 메모리에 생성해서 스프링 컨테이너에서 관리해준다. 
 * */ 
public class BlogControllerTest {
	
	@GetMapping("/test")
	public String test() {
		return "Rest Controller return test text";
	}
}
