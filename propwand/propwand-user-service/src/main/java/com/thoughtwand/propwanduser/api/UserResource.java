package com.thoughtwand.propwanduser.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.thoughtwand.propwanduser.domain.User;
import com.thoughtwand.propwanduser.service.UserService;

import io.swagger.annotations.ApiOperation;

/**
 * @author Dayan Kodippily - 23/05/20
 */

@RestController
@RequestMapping("api/users")
public class UserResource {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/{email}",produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation (value = "Get the user for the matching email", response = User.class)
	public User findUser(@PathVariable(value = "email") String email) {
		return userService.findUserByEmail(email);		
	}

	@PostMapping("/create")
	@ApiOperation (value = "Create a new User in the system", response = User.class)
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);		
	}

}
