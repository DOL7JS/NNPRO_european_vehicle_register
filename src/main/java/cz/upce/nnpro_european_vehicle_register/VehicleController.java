package cz.upce.nnpro_european_vehicle_register;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
    private final CarRepository carRepository;

    public VehicleController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/getCarByVin/{vin}")
    public ResponseEntity<?> getCarByVin(@PathVariable String vin) {
        return ResponseEntity.ok(carRepository.findByVin(vin));
    }

    @GetMapping("/getCarBySpz/{spz}")
    public ResponseEntity<?> getCarBySpz(@PathVariable String spz) {
        return ResponseEntity.ok(carRepository.findBySpz(spz));
    }
}
