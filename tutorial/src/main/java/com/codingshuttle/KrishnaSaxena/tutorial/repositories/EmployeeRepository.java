package com.codingshuttle.KrishnaSaxena.tutorial.repositories;

import com.codingshuttle.KrishnaSaxena.tutorial.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
