package com.epam.spring.payments.dto;


import com.sun.istack.NotNull;
import java.math.BigInteger;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

public class CardDTO {

  @Id
  private Long id;
  @NotNull
  @NotEmpty
  private BigInteger cardNumber;
  private Integer pin;
  private Integer cvv;
  private String expiryDate;
  private String cardType;


  public CardDTO() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BigInteger getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(BigInteger cardNumber) {
    this.cardNumber = cardNumber;
  }

  public Integer getPin() {
    return pin;
  }

  public void setPin(Integer pin) {
    this.pin = pin;
  }

  public Integer getCvv() {
    return cvv;
  }

  public void setCvv(Integer cvv) {
    this.cvv = cvv;
  }

  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }
}
