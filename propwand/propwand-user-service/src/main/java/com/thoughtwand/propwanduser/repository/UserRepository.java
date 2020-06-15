package com.thoughtwand.propwand.userservice.repo;

import com.thoughtwand.propwand.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author Dayan Kodippily - 23/05/20
 */

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
}
