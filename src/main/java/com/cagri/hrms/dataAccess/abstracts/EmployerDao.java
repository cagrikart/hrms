package com.cagri.hrms.dataAccess.abstracts;

import com.cagri.hrms.entities.concretes.Employers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerDao extends JpaRepository<Employers,Integer> {
}
