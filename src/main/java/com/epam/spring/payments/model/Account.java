package com.epam.spring.payments.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@javax.persistence.Entity
public class Account extends Entity {

  private static final long serialVersionUID = 4716395168539434663L;
  private final BigDecimal INIT_AMOUNT_CAPACITY = BigDecimal.ZERO;
  private BigInteger accountNumber;
  private String userLogin;
  private BigDecimal amount;
  private String currency;
  private String status;

  public Account() {
  }

  public Account(String currency) {
    this.currency = currency;
    this.amount = INIT_AMOUNT_CAPACITY;
    this.status = "PENDING";
  }

  public BigInteger getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(BigInteger accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getUserLogin() {
    return userLogin;
  }

  public void setUserLogin(String userLogin) {
    this.userLogin = userLogin;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    if (amount.compareTo(BigDecimal.ZERO) >= 0) {
      this.amount = amount;
    }
  }


}
