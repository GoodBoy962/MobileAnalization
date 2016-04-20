package com.salats.repository;

import com.salats.model.User;
import com.salats.model.WebConnection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by aleksandrpliskin on 20.04.16.
 */
@Repository
public interface WebConnectionRepository extends JpaRepository<WebConnection, Long> {

    @Query("select sum(w.duration) from WebConnection w where w.user = :user")
    Integer findDurationByUser(@Param("user") User user);

}
