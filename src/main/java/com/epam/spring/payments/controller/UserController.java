package com.epam.spring.payments.controller;

import com.epam.spring.payments.dto.UserDTO;
import com.epam.spring.payments.service.UserService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

  private final Logger log = LoggerFactory.getLogger(UserController.class);
  private final UserService service;

  public UserController(UserService service) {
    this.service = service;
  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/all")
  public List<UserDTO> getAllUsers() {
    log.info("Getting all users");
    return service.getAll();
  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("/{id}")
  public UserDTO getUserById(@PathVariable Long id) {
    log.info("trying to get user from DB with id: " + id);
    return service.getUserById(id);
  }


  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping()
  public void createUser(@RequestBody UserDTO userDTO) {
    log.info("Saving to DB user: " + userDTO.toString());
    service.save(userDTO);
  }

  @ResponseStatus(HttpStatus.OK)
  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable Long id) {
    log.info("Deleting user with id: " + id);
    service.delete(id);
  }

  @ResponseStatus(HttpStatus.OK)
  @PutMapping("/{id}")
  public void updateUser(@RequestBody UserDTO userDTO, @PathVariable Long id) {
    log.info("update user name & surname with parameters: " + userDTO.getName() + " "
        + userDTO.getSurname());
    service.update(userDTO, id);
  }

}
