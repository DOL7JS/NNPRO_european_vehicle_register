package cz.upce.nnpro_european_vehicle_register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    Car findBySpz(String spz);

    Car findByVin(String vin);

}
