package com.thoughtwand.propwanduser.repository;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.thoughtwand.propwanduser.domain.User;
import com.thoughtwand.propwanduser.domain.UserSalutation;
import com.thoughtwand.propwanduser.domain.UserSex;
import com.thoughtwand.propwanduser.domain.UserStatus;

@DataJpaTest
class UserRepositoryTest {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private EntityManager entityManager;

	@Autowired
	private UserRepository userRpository;

	@Test
	public void testConfig() {
		assertThat(dataSource).isNotNull();
		assertThat(entityManager).isNotNull();
		assertThat(userRpository).isNotNull();
	}

	@Test
	public void testCreateAndFind() {

		User user = new User();
		user.setEmail("gihal83@gmail.com");
		user.setFirstName("Gihal");
		user.setLastName("Mapalagama");
		user.setSalutation(UserSalutation.MR);
		user.setUserSex(UserSex.MALE);
		user.setUserStatus(UserStatus.ACTIVE);
		userRpository.save(user);
		assertThat(userRpository.findAll().size() == 1).isTrue();
		user = userRpository.findUserByEmail("gihal83@gmail.com");
		assertThat(user).isNotNull();
	}

}
