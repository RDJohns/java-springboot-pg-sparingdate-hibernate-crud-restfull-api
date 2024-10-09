package net.javeguides.ems.service;

import net.javeguides.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto creteEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);
    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee);

    void deleteEmployee(Long employeeId);
}
