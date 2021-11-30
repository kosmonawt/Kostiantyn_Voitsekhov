package com.epam.spring.payments.dto;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Id;
import javax.validation.constraints.Positive;


public class AccountDTO {

  @Id
  private Long id;

  @Positive
  private BigDecimal amount;
  private String currency;
  private String status;
  private List<CardDTO> cardDTOS;
  private List<PaymentDTO> paymentDTOList;

  public AccountDTO() {
  }

  public List<CardDTO> getCardDTOS() {
    return cardDTOS;
  }

  public void setCardDTOS(List<CardDTO> cardDTOS) {
    this.cardDTOS = cardDTOS;
  }

  public List<PaymentDTO> getPaymentDTOList() {
    return paymentDTOList;
  }

  public void setPaymentDTOList(List<PaymentDTO> paymentDTOList) {
    this.paymentDTOList = paymentDTOList;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
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
}
