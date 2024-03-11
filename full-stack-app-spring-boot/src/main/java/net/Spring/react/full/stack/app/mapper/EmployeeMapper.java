package net.Spring.react.full.stack.app.mapper;

import net.Spring.react.full.stack.app.dto.EmployeeDto;
import net.Spring.react.full.stack.app.entity.Employee;

public class EmployeeMapper  {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
