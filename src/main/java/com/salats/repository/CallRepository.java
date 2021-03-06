package com.salats.repository;

import com.salats.model.Call;
import com.salats.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by aleksandrpliskin on 19.04.16.
 */
@Repository
public interface CallRepository extends JpaRepository<Call, Long> {

    @Query("select sum(c.duration) from Call c where c.user = :user")
    Integer findSumDurationByUserBetweenStartDateAndEndDate(@Param("user") User user);
}
