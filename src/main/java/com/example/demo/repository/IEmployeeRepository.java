package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

/**
 * JPA-interface that contains the full API of employee CRUD Repository.
 * 
 * @author Daniel Manzano Borja
 * @since 21-MAY-2025
 * 
 */
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
