package com.epam.spring.payments.repo;

import com.epam.spring.payments.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {


  @Modifying
  @Transactional(isolation = Isolation.READ_COMMITTED)
  @Query("update Payment p set p.paymentStatus =:status where p.id =:id")
  void updateStatusByAccId(@Param("status") String status, @Param("id") Long id);

}
