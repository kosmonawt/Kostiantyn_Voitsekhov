package com.epam.spring.payments.service;

import com.epam.spring.payments.dto.CardDTO;

public interface CardService {


  void save(CardDTO cardDTO);

  CardDTO findCardById(Long id);

  void deleteById(Long id);
}
