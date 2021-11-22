package com.epam.spring.payments.mapper;

import com.epam.spring.payments.dto.CardDTO;
import com.epam.spring.payments.model.Card;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {

  CardDTO mapTo(Card card);

  Card mapFrom(CardDTO card);

  List<CardDTO> mapListTo(List<Card> cards);
  List<Card> mapListFrom(List<CardDTO> cardDTOS);

}
