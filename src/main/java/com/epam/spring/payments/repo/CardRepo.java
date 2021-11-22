package com.epam.spring.payments.repo;

import com.epam.spring.payments.model.Card;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepo extends JpaRepository<Card, Long> {

  List<Card> findAllByAccountNum(BigInteger accNum);

  @Query(value = "SELECT * FROM Card WHERE account_num = (SELECT account_number FROM Account where user_login = ?1)", nativeQuery = true)
  List<Card> findAllByUserEmail(@Param("email") String email);

}
