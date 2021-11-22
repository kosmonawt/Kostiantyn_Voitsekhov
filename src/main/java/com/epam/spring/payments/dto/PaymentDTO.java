package com.epam.spring.payments.dto;

import com.sun.istack.NotNull;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

public class PaymentDTO {

  @Id
  private Long id;
  private BigInteger paymentNum;

  @NotNull
  @NotEmpty
  private BigInteger paymentFromAccount;

  @NotNull
  @NotEmpty
  private BigInteger paymentToAccount;
  private LocalDateTime dateTime;

  @Positive
  @NotEmpty
  @NotNull
  private BigDecimal amount;
  private String paymentStatus;
  private String sender;
  private String recipient;

  public PaymentDTO() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BigInteger getPaymentNum() {
    return paymentNum;
  }

  public void setPaymentNum(BigInteger paymentNum) {
    this.paymentNum = paymentNum;
  }

  public BigInteger getPaymentFromAccount() {
    return paymentFromAccount;
  }

  public void setPaymentFromAccount(BigInteger paymentFromAccount) {
    this.paymentFromAccount = paymentFromAccount;
  }

  public BigInteger getPaymentToAccount() {
    return paymentToAccount;
  }

  public void setPaymentToAccount(BigInteger paymentToAccount) {
    this.paymentToAccount = paymentToAccount;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }
}
