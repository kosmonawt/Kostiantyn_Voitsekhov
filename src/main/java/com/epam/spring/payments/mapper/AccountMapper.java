package com.epam.spring.payments.mapper;

import com.epam.spring.payments.dto.AccountDTO;
import com.epam.spring.payments.model.Account;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {

  AccountDTO mapTo(Account account);

  Account mapFrom(AccountDTO accountDTO);

  List<AccountDTO> mapListTo(List<Account> accounts);

  List<Account> mapListFrom(List<AccountDTO> accountDTOS);


}
