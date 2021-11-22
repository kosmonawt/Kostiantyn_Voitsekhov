package com.epam.spring.payments.service;

import com.epam.spring.payments.dto.AccountDTO;
import java.util.List;

public interface AccountService {

  List<AccountDTO> findAllByUserEmail(String email);

  void save(AccountDTO accountDTO);

  void deleteById(Long id);

  AccountDTO getAccountById(Long id);

  void updateStatusByAccId(String status, Long id);
}
