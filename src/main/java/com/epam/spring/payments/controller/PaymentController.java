package com.epam.spring.payments.controller;

import com.epam.spring.payments.dto.PaymentDTO;
import com.epam.spring.payments.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

  private final Logger log = LoggerFactory.getLogger(PaymentController.class);
  private final PaymentService paymentService;

  public PaymentController(PaymentService paymentService) {
    this.paymentService = paymentService;
  }


  @GetMapping("/{id}")
  public PaymentDTO getPaymentById(@PathVariable Long id) {
    log.info("Get payment by id");
    return paymentService.getPaymentById(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void savePayment(@RequestBody PaymentDTO paymentDTO) {
    log.info("Saving payment");
    paymentService.save(paymentDTO);
  }

  @DeleteMapping("/{id}")
  public void deletePaymentById(@PathVariable Long id) {
    paymentService.deleteById(id);
  }


}
