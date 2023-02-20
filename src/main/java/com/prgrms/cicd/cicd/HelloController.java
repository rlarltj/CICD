package com.prgrms.cicd.cicd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HelloController {

	private final UserRepository userRepository;

	@GetMapping("/hello")
	public String hello() {
		log.info("hello controller");

		User user = User.builder()
			.username("kiseo").build();
		userRepository.save(user);

		return "hello";
	}
}
