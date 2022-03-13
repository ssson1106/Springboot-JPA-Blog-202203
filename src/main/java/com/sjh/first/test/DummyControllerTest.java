package com.sjh.first.test;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjh.first.blog.model.RoleType;
import com.sjh.first.blog.model.User;
import com.sjh.first.blog.repository.UserRepository;

//파일을 찾아서 리턴하는게 아니라 데이터를 리턴하는 컨트롤러
@RestController
public class DummyControllerTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/dummy/join")
	//public String join(String username, String email, String password) {
	public String join(User user) {
		System.out.println(user.toString());
		
		user.setRole(RoleType.USER);
		userRepository.save(user);
		
		return "회원가입이 완료되었습니다.";
	}
	
	@GetMapping("/dummy/user/{id}")
	public User detail(@PathVariable int id) {
		
		User user = userRepository.findById(id).orElseThrow(new Supplier<IllegalArgumentException>() {
			@Override
			public IllegalArgumentException get() {
				return new IllegalArgumentException("해당 유저는 없습니다. id = "+ id);
			}
		});
		
		// 응답할때 스프링의 메세지 컨버터가 작동해서 자바오브젝트를 Jakson 라이브러리를 호출해서
		// user 오브젝트를 json으로 변환해서 브라우저에게 리턴한다.
		return user;
	}
}
