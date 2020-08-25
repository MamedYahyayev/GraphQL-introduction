package az.maqa.spring.graphql.resolver.query;

import az.maqa.spring.graphql.dto.EmployeeDTO;
import az.maqa.spring.graphql.response.ResponseEmployee;
import az.maqa.spring.graphql.service.EmployeeService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.google.common.reflect.TypeToken;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.List;

@Component
@RequiredArgsConstructor
public class EmployeeQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private EmployeeService employeeService;

    public List<ResponseEmployee> findAllEmployees() {
        List<EmployeeDTO> employeeList = employeeService.getAllEmployees();

        Type listType = new TypeToken<List<ResponseEmployee>>() {
        }.getType();
        ModelMapper modelMapper = new ModelMapper();

        List<ResponseEmployee> response = modelMapper.map(employeeList, listType);

        return response;
    }

    public ResponseEmployee findEmployeeById(Long id) {
        EmployeeDTO employee = employeeService.getEmployeeById(id);

        ModelMapper modelMapper = new ModelMapper();

        ResponseEmployee response = modelMapper.map(employee, ResponseEmployee.class);

        return response;
    }

}
