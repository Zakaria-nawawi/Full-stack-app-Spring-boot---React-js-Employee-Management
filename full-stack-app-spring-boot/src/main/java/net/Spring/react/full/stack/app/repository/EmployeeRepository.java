package net.Spring.react.full.stack.app.repository;

import net.Spring.react.full.stack.app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
