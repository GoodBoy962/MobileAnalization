package com.salats.repository;

import com.salats.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aleksandrpliskin on 20.04.16.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
