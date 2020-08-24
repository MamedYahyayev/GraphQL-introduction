package az.maqa.spring.graphql.resolver;

import az.maqa.spring.graphql.entity.Vehicle;
import az.maqa.spring.graphql.repository.VehicleRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VehicleQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicles(String type) {
        return vehicleRepository.getByTypeLike(type);
    }

    public Optional<Vehicle> getById(Long id) {
        return vehicleRepository.findById(id);
    }
}
