package com.epam.spring.payments.service;

import com.epam.spring.payments.dto.CardDTO;
import java.math.BigInteger;
import java.util.List;

public interface CardService {

  List<CardDTO> findAllCardsByUserEmail(String email);

  void save(CardDTO cardDTO);

  CardDTO findCardById(Long id);

  void deleteById(Long id);
}
