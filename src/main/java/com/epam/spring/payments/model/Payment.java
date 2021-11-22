package com.epam.spring.payments.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

@javax.persistence.Entity
public class Payment extends Entity {

  private static final long serialVersionUID = 5692708766041889396L;
  private BigInteger paymentNum;
  private BigInteger paymentFromAccount;
  private BigInteger paymentToAccount;
  private LocalDateTime dateTime;
  private BigDecimal amount;
  private String paymentStatus;
  private String sender;
  private String recipient;

  public Payment() {
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
}
