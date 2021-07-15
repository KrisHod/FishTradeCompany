package com.fishTrade.repository;

import com.fishTrade.entity.Employee;
import com.fishTrade.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findByPosition(Position position);
}
