package com.thoughtwand.propwand.userservice.controller;

import com.thoughtwand.propwand.userservice.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Dayan Kodippily - 23/05/20
 */

@RestController
@RequestMapping("propwand/vi/")
public class UserController {


    @GetMapping("/user/{username}")
    public ResponseEntity<String> findUser(@PathVariable(value = "username") String name) {
        return  ResponseEntity.ok().body("Hello " + name + " Welcome..!!");
    }

    @GetMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        return  ResponseEntity.ok().body("Hello " + user + " Welcome..!!");
    }


}
