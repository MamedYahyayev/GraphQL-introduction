package az.maqa.spring.graphql.repository;

import az.maqa.spring.graphql.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findAll();

    Employee findEmployeeById(Long id);
}
