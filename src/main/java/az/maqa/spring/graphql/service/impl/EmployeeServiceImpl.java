package az.maqa.spring.graphql.service.impl;

import az.maqa.spring.graphql.dto.EmployeeDTO;
import az.maqa.spring.graphql.entity.Employee;
import az.maqa.spring.graphql.repository.EmployeeRepository;
import az.maqa.spring.graphql.request.RequestEmployee;
import az.maqa.spring.graphql.service.EmployeeService;
import com.google.common.reflect.TypeToken;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        Type listType = new TypeToken<List<EmployeeDTO>>() {
        }.getType();

        ModelMapper modelMapper = new ModelMapper();

        List<Employee> employees = employeeRepository.findAll();

        List<EmployeeDTO> returnValue = modelMapper.map(employees, listType);

        return returnValue;
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        ModelMapper modelMapper = new ModelMapper();

        Employee employee = employeeRepository.findById(id).get();

        EmployeeDTO returnValue = modelMapper.map(employee, EmployeeDTO.class);

        return returnValue;
    }

    @Override
    public EmployeeDTO createEmployee(RequestEmployee requestEmployee) {
        ModelMapper modelMapper = new ModelMapper();

        Employee employee = modelMapper.map(requestEmployee, Employee.class);

        Employee savedEmployee = employeeRepository.save(employee);

        EmployeeDTO employeeDTO = modelMapper.map(savedEmployee, EmployeeDTO.class);

        return employeeDTO;
    }

    @Override
    public EmployeeDTO updateEmployee(RequestEmployee requestEmployee, Long id) {
        ModelMapper modelMapper = new ModelMapper();

        Employee employee = modelMapper.map(requestEmployee, Employee.class);
        employee.setId(id);

        Employee savedEmployee = employeeRepository.save(employee);

        EmployeeDTO employeeDTO = modelMapper.map(savedEmployee, EmployeeDTO.class);

        return employeeDTO;
    }
}
