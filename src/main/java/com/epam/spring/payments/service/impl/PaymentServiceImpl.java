package com.epam.spring.payments.service.impl;

import com.epam.spring.payments.dto.PaymentDTO;
import com.epam.spring.payments.mapper.PaymentMapper;
import com.epam.spring.payments.repo.PaymentRepo;
import com.epam.spring.payments.service.PaymentService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service

public class PaymentServiceImpl implements PaymentService {

  private final Logger log = LoggerFactory.getLogger(CardServiceImpl.class);

  private final PaymentRepo repo;
  private final PaymentMapper mapper;

  public PaymentServiceImpl(PaymentRepo repo, PaymentMapper mapper) {
    this.repo = repo;
    this.mapper = mapper;
  }

  @Override
  public List<PaymentDTO> getAllPayments() {
    log.info("get all payments");
    return mapper.mapListTo(repo.findAll());
  }

  @Override
  public PaymentDTO getPaymentById(Long id) {
    return mapper.mapTo(repo.getById(id));
  }

  @Override
  public void save(PaymentDTO paymentDTO) {
    repo.save(mapper.mapFrom(paymentDTO));
  }

  @Override
  public void deleteById(Long id) {
    log.info("deleting payment...");
    repo.deleteById(id);
  }
}
