package com.sjh.first.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjh.first.test.entity.Member;

//@Controller //사용자가 요청 -> 응답(html)
@RestController // 사용자가 요청 -> 응답(data)
public class HttpControllerTest {

	@GetMapping("/http/get")
	public String getTest(Member user) {
		return "get 요청" + user.toString();
	}

	@PostMapping("/http/post")
	public String postTest(Member user) {
		user.setId(999);

		Member user2 = Member.builder().id(2).username("test2").email("test@test.com").password("test").build();

		return "post 요청" + user2.toString();
	}

	@PutMapping("/http/put")
	public String putTest() {
		return "put 요청";
	}

	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
