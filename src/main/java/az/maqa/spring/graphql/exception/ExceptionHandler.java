package az.maqa.spring.graphql.exception;

import az.maqa.spring.graphql.dto.EmployeeDTO;
import az.maqa.spring.graphql.response.Error;
import az.maqa.spring.graphql.response.ErrorDetails;
import az.maqa.spring.graphql.response.ResponseStatus;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ExceptionHandler {

    public EmployeeDTO employeeNotFound() {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        ErrorDetails errorDetails = new ErrorDetails(ExceptionConstants.SEND_REPORT, "employee not found"
                , "Find Employee");

        List<Error> errorList = new ArrayList<>();
        errorList.add(new Error(101.0, "Employee Not Found"));

        ResponseStatus status = new ResponseStatus(1.1, errorDetails, errorList);

        employeeDTO.setStatus(status);

        return employeeDTO;
    }


}
