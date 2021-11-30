package com.epam.spring.payments.service.impl;


import com.epam.spring.payments.dto.UserDTO;
import com.epam.spring.payments.mapper.UserMapper;
import com.epam.spring.payments.model.User;
import com.epam.spring.payments.repo.UserRepo;
import com.epam.spring.payments.service.UserService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

  private final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
  private final UserRepo repo;
  private final UserMapper mapper;

  public UserServiceImpl(UserRepo repo, UserMapper mapper) {
    this.repo = repo;
    this.mapper = mapper;
  }

  public boolean existsByEmail(String email) {
    try {
      return repo.existsByEmail(email);
    } catch (NullPointerException e) {
      return false;
    }
  }


  public void save(UserDTO userDTO) {
    repo.save(mapper.mapFrom(userDTO));
  }

  public UserDTO getUserByEmail(String email) {
    try {
      return mapper.mapTo(repo.getUserByEmail(email));
    } catch (NullPointerException e) {
      return new UserDTO();
    }
  }

  public boolean find(String email, String password) {
    UserDTO userDTO;
    try {
      userDTO = getUserByEmail(email);
      return userDTO.getPassword().equals(password);
    } catch (NullPointerException e) {
      return false;
    }
  }

  public UserDTO find(String email, List<String> password){
    return new UserDTO();
  }

  public UserDTO getUserById(Long userId) {
    return mapper.mapTo(repo.getById(userId));
  }

  public List<UserDTO> getAll() {
    return mapper.mapListTo(repo.findAll());
  }


  public void delete(Long id) {
    repo.deleteById(id);
  }

  public void update(UserDTO userDTO, Long id) {
    User user = mapper.mapFrom(userDTO);
    repo.update(user.getName(), user.getSurname(), id);
  }
}
