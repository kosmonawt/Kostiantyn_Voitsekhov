package com.epam.spring.payments.service;

import com.epam.spring.payments.dto.AccountDTO;

public interface AccountService {

  void save(AccountDTO accountDTO);

  void deleteById(Long id);

  AccountDTO getAccountById(Long id);

  void updateStatusByAccId(String status, Long id);
}
