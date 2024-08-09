package com.example.taskmanagment.controller;

import com.example.taskmanagment.entity.User;
import com.example.taskmanagment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
  @Autowired
  private UserService userService;

  @PostMapping("/register")
  public void register(@RequestBody User user) {
    userService.saveUser(user);
  }

  @PostMapping("/login")
  public String login(@RequestBody User user) {
    // Implement login logic to return JWT token
    return "JWT Token";
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        UserDetails userDetails = userService.loadUserByUsername(user.getUsername());

        if (bCryptPasswordEncoder.matches(user.getPassword(), userDetails.getPassword())) {
            String token = jwtTokenUtil.generateToken(userDetails.getUsername());
            return ResponseEntity.ok(new JwtResponse(token));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

  }
}
