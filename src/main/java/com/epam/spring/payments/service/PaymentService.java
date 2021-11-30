package com.epam.spring.payments.service;

import com.epam.spring.payments.dto.PaymentDTO;
import java.util.List;

public interface PaymentService {


  PaymentDTO getPaymentById(Long id);

  void save(PaymentDTO paymentDTO);

  void deleteById(Long id);
}
