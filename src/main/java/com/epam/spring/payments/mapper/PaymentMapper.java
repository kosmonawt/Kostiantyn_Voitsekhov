package com.epam.spring.payments.mapper;

import com.epam.spring.payments.dto.PaymentDTO;
import com.epam.spring.payments.model.Payment;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

  PaymentDTO mapTo(Payment payment);

  Payment mapFrom(PaymentDTO paymentDTO);

  List<PaymentDTO> mapListTo(List<Payment> payments);

  List<Payment> mapListFrom(List<PaymentDTO> paymentDTOS);


}
