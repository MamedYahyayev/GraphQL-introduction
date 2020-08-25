package az.maqa.spring.graphql.dto;

import az.maqa.spring.graphql.entity.Department;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {

    private Long id;

    private String name;

    private String surname;

    private int age;

    private String job;

    private Double salary;

    private Department department;
}
