package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.module.ReportingManager;

@Repository
public interface RManagerRepo extends JpaRepository<ReportingManager , Integer> {

}
