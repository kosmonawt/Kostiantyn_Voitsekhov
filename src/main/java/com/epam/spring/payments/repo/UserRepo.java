package com.epam.spring.payments.repo;

import com.epam.spring.payments.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

  boolean existsByEmail(String email);

  User getUserByEmail(String email);

  @Modifying(flushAutomatically = true)
  @Transactional(isolation = Isolation.READ_COMMITTED)
  @Query("update User u set u.name =:name, u.surname =:surname where u.id =:id")
  void update(@Param("name") String name, @Param("surname") String surname, @Param("id") Long id);
}
