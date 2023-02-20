package com.prgrms.cicd.cicd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	void test() {
		User user = User.builder()
			.username("testUser")
			.build();

		userRepository.save(user);

		User findUser = userRepository.findById(user.getId()).get();

		Assertions.assertEquals(findUser, user);
	}

	@Test
	void test2() {

		User user = User.builder()
			.username("testUser2")
			.build();

		userRepository.save(user);

		User findUser = userRepository.findById(user.getId()).get();

		Assertions.assertEquals(findUser, user);
	}

	@Test
	void test3() {

		User user = User.builder()
			.username("testUser3")
			.build();

		userRepository.save(user);

		User findUser = userRepository.findById(user.getId()).get();

		Assertions.assertEquals(findUser, user);
	}

	@Test
	void test4() {
		User user = User.builder()
			.username("testUser4")
			.build();

		userRepository.save(user);

		User findUser = userRepository.findById(user.getId()).get();

		Assertions.assertEquals(findUser, user);
	}
}