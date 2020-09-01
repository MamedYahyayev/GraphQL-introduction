package az.maqa.spring.graphql.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "department")
@Getter
@Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departmentName;

    private String departmentCode;



}
