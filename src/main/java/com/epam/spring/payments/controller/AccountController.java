package com.epam.spring.payments.controller;

import com.epam.spring.payments.dto.AccountDTO;
import com.epam.spring.payments.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

  private final Logger log = LoggerFactory.getLogger(AccountController.class);

  private final AccountService accountService;

  public AccountController(AccountService accountService) {
    this.accountService = accountService;
  }

  @PostMapping
  public void createAccount(@RequestBody AccountDTO accountDTO) {
    log.info("saving acc to DB - acc controller");
    accountService.save(accountDTO);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    accountService.deleteById(id);
  }

  @GetMapping("/{id}")
  public AccountDTO getAccById(@PathVariable Long id) {
    return accountService.getAccountById(id);
  }

  @PatchMapping(" /upd-status/{id}")
  public void updateStatusByAccId(@RequestParam(name = "status") String status,
      @PathVariable Long id) {
    accountService.updateStatusByAccId(status, id);
  }

}


