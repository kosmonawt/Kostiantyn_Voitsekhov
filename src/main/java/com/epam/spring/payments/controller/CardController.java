package com.epam.spring.payments.controller;

import com.epam.spring.payments.dto.CardDTO;
import com.epam.spring.payments.service.CardService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {
  private final Logger log = LoggerFactory.getLogger(CardController.class);
  private final CardService cardService;

  public CardController(CardService cardService) {
    this.cardService = cardService;
  }

  @GetMapping("/all")
  @ResponseStatus(HttpStatus.OK)
  public List<CardDTO> getCardsByUserEmail(@RequestAttribute(name = "accNum") String email) {
    log.info("get all user cards");
    return cardService.findAllCardsByUserEmail(email);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void save(@RequestBody CardDTO cardDTO) {
    cardService.save(cardDTO);
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public CardDTO getCardById(@PathVariable Long id) {
    return cardService.findCardById(id);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void deleteCardById(@PathVariable Long id) {
    cardService.deleteById(id);
  }

}
