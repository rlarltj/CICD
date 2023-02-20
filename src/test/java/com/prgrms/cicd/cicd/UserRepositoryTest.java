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
	void test5() {
		User user = User.builder()
			.username("testUser5")
			.build();

		userRepository.save(user);

		User findUser = userRepository.findById(user.getId()).get();

		Assertions.assertEquals(findUser, user);
	}
}