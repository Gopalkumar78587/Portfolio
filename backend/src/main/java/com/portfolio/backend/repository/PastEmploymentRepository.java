package com.portfolio.backend.repository;

import com.portfolio.backend.entity.PastEmployment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PastEmploymentRepository extends JpaRepository<PastEmployment, Long> {

    List<PastEmployment> findAllByOrderByStartDateDesc();
}
