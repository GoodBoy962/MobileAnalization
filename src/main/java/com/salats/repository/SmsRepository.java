package com.salats.repository;

import com.salats.model.Sms;
import com.salats.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by aleksandrpliskin on 20.04.16.
 */
@Repository
public interface SmsRepository extends JpaRepository<Sms, Long> {

    @Query(value = "select count(s) from Sms s where s.user = :user")
    Integer findSmsCountByUserBetweenStartDateAndEndDate(@Param("user") User user);

}
