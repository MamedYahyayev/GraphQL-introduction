package az.maqa.spring.graphql.response;

import az.maqa.spring.graphql.entity.Department;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseEmployee {

    private Long id;

    private String name;

    private String surname;

    private int age;

    private String job;

    private Double salary;

    private Department department;

    private ResponseStatus status;
}
