package az.maqa.spring.graphql.resolver.mutation;

import az.maqa.spring.graphql.dto.EmployeeDTO;
import az.maqa.spring.graphql.request.RequestEmployee;
import az.maqa.spring.graphql.response.ResponseEmployee;
import az.maqa.spring.graphql.service.EmployeeService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EmployeeMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private EmployeeService employeeService;

    public ResponseEmployee createEmployee(RequestEmployee requestEmployee) {
        EmployeeDTO savedEmployee = employeeService.createEmployee(requestEmployee);

        ModelMapper modelMapper = new ModelMapper();

        ResponseEmployee response = modelMapper.map(savedEmployee, ResponseEmployee.class);

        return response;
    }

    public ResponseEmployee updateEmployee(RequestEmployee requestEmployee, Long id) {
        EmployeeDTO updatedEmployee = employeeService.updateEmployee(requestEmployee, id);

        ModelMapper modelMapper = new ModelMapper();

        ResponseEmployee response = modelMapper.map(updatedEmployee, ResponseEmployee.class);

        return response;
    }

}
