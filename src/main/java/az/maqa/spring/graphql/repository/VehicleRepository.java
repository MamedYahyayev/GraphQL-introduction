package az.maqa.spring.graphql.repository;

import az.maqa.spring.graphql.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle , Long> {

    List<Vehicle> getByTypeLike(String type);

}
