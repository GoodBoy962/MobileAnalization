package com.salats.repository;

import com.salats.model.User;
import com.salats.model.WifiConnection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by aleksandrpliskin on 20.04.16.
 */
public interface WifiConnectionRepository extends JpaRepository<WifiConnection, Long> {

    @Query("select sum(w.duration) from WifiConnection w where w.user = :user")
    Integer findDurationByUser(@Param("user") User user);

}
