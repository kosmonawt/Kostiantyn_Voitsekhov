package com.epam.spring.payments.model;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.OneToMany;

@javax.persistence.Entity
public class Account extends Entity {

  private static final long serialVersionUID = 4716395168539434663L;
  private final BigDecimal INIT_AMOUNT_CAPACITY = BigDecimal.ZERO;
  private BigDecimal amount;
  private String currency;
  private String status;
  @OneToMany
  private List<Card> cards;
  @OneToMany
  private List<Payment> payments;

  public Account() {
  }

  public Account(String currency) {
    this.currency = currency;
    this.amount = INIT_AMOUNT_CAPACITY;
    this.status = "PENDING";
  }

  public List<Card> getCards() {
    return cards;
  }

  public void setCards(List<Card> cards) {
    this.cards = cards;
  }

  public List<Payment> getPayments() {
    return payments;
  }

  public void setPayments(List<Payment> payments) {
    this.payments = payments;
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
