package com.epam.spring.payments.service.impl;

import com.epam.spring.payments.dto.CardDTO;
import com.epam.spring.payments.mapper.CardMapper;
import com.epam.spring.payments.repo.CardRepo;
import com.epam.spring.payments.service.CardService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

  private final Logger log = LoggerFactory.getLogger(CardServiceImpl.class);
  private final CardRepo repo;
  private final CardMapper mapper;

  public CardServiceImpl(CardRepo repo, CardMapper mapper) {
    this.repo = repo;
    this.mapper = mapper;
  }


  @Override
  public List<CardDTO> findAllCardsByUserEmail(String email) {
    log.info("Search for card by acc number");
    return mapper.mapListTo(repo.findAllByUserEmail(email));
  }

  @Override
  public void save(CardDTO cardDTO) {
    log.info("Card service... saving card...");
    repo.save(mapper.mapFrom(cardDTO));
  }

  @Override
  public CardDTO findCardById(Long id) {
    log.info("Search for card with id: ");
    return mapper.mapTo(repo.findById(id).orElseThrow());
  }

  @Override
  public void deleteById(Long id) {
    log.info("Deleting card by id: " + id);
    repo.deleteById(id);
  }
}
