package com.epam.spring.payments.service;

import com.epam.spring.payments.dto.UserDTO;
import java.util.List;

public interface UserService {

  boolean existsByEmail(String email);


  void save(UserDTO userDTO);

  UserDTO getUserByEmail(String email);

  boolean find(String email, String password);

  UserDTO getUserById(Long userId);

  List<UserDTO> getAll();

  void delete(Long id);

  public void update(UserDTO userDTO, Long id);

}
