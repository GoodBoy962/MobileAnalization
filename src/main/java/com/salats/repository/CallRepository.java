package com.salats.repository;

import com.salats.model.Call;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aleksandrpliskin on 19.04.16.
 */
@Repository
public interface CallRepository extends JpaRepository<Call, Long> {
}
