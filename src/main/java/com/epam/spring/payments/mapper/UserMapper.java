package com.epam.spring.payments.mapper;

import com.epam.spring.payments.dto.UserDTO;
import com.epam.spring.payments.model.User;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

  UserDTO mapTo(User user);

  User mapFrom(UserDTO userDTO);

  List<User> mapListFrom(List<UserDTO> list);

  List<UserDTO> mapListTo(List<User> list);

}
