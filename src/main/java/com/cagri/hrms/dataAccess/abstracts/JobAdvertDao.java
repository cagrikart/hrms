package com.cagri.hrms.dataAccess.abstracts;

import com.cagri.hrms.entities.concretes.JobAdverts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobAdvertDao extends JpaRepository<JobAdverts,Integer> {
}
