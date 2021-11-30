package com.epam.spring.payments.service.impl;

import com.epam.spring.payments.dto.AccountDTO;
import com.epam.spring.payments.mapper.AccountMapper;
import com.epam.spring.payments.repo.AccountRepo;
import com.epam.spring.payments.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service

public class AccountServiceImpl implements AccountService {

  private final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

  private final AccountRepo accountRepo;
  private final AccountMapper mapper;

  public AccountServiceImpl(AccountRepo accountRepo,
      AccountMapper mapper) {
    this.accountRepo = accountRepo;
    this.mapper = mapper;
  }


  @Override
  public void save(AccountDTO accountDTO) {
    accountRepo.save(mapper.mapFrom(accountDTO));
  }

  @Override
  public void deleteById(Long id) {
    log.info("Deleting acc...");
    accountRepo.deleteById(id);
  }

  @Override
  public AccountDTO getAccountById(Long id) {
    return mapper.mapTo(accountRepo.getById(id));
  }

  @Override
  public void updateStatusByAccId(String status, Long id) {
    accountRepo.updateStatusByAccId(status, id);
  }
}

