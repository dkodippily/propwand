package com.thoughtwand.propwanduser.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.thoughtwand.propwanduser.domain.User;
import com.thoughtwand.propwanduser.service.UserService;

/**
 * @author Dayan Kodippily - 23/05/20
 */

@RestController
@RequestMapping("api/users")
public class UserResource {

	@Autowired
	private UserService userService;

	@GetMapping("/user/{email}")
	public User findUser(@PathVariable(value = "email") String email) {
		User user = userService.findUserByEmail(email);
		return user;
	}

	@PostMapping("/create")
	public ResponseEntity<String> createUser(@RequestBody User user) {
		userService.createUser(user);
		return ResponseEntity.ok().body("Created...");
	}

}
