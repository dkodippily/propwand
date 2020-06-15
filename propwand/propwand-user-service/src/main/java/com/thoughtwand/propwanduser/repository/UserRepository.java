package com.thoughtwand.propwanduser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.thoughtwand.propwanduser.domain.User;

/**
 * @author Dayan Kodippily - 23/05/20
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("FROM User where email = :email")
	public User findUserByEmail(@Param("email") String email);
}
