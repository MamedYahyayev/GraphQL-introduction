package az.maqa.spring.graphql.service;

import az.maqa.spring.graphql.dto.EmployeeDTO;
import az.maqa.spring.graphql.request.RequestEmployee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO getEmployeeById(Long id);

    EmployeeDTO createEmployee(RequestEmployee requestEmployee);

    EmployeeDTO updateEmployee(RequestEmployee requestEmployee, Long id);
}
