package az.maqa.spring.graphql.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "employee")
@Getter
@Setter
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;

    private int age;

    private String job;

    private Float salary;

    //private Department department;

}
