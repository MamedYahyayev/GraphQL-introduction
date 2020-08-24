package az.maqa.spring.graphql.resolver;

import az.maqa.spring.graphql.dto.VehicleDTO;
import az.maqa.spring.graphql.entity.Vehicle;
import az.maqa.spring.graphql.repository.VehicleRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class VehicleMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle createVehicle(VehicleDTO vehicleDTO) {
        return vehicleRepository.save(dtoToEntity(vehicleDTO));
    }

    private Vehicle dtoToEntity(VehicleDTO vehicleDTO) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrandName(vehicleDTO.getBrandName());
        vehicle.setModelCode(vehicleDTO.getModelCode());
        vehicle.setVehicleType(vehicleDTO.getType());
        vehicle.setLaunchDate(new Date());
        return vehicle;
    }
}
