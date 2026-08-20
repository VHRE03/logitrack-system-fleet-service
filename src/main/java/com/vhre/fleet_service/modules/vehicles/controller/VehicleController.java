package com.vhre.fleet_service.modules.vehicles.controller;

import com.vhre.fleet_service.core.base.controller.BaseController;
import com.vhre.fleet_service.modules.vehicles.dto.VehicleDTO;
import com.vhre.fleet_service.modules.vehicles.entity.Vehicle;
import com.vhre.fleet_service.modules.vehicles.service.VehicleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/vehicles")
@Tag(name = "Vehicle Management", description = "Endpoints for managing enterprise transportation vehicles and their capacities")
public class VehicleController extends BaseController<Vehicle, VehicleDTO, UUID> {

    public VehicleController(VehicleService service) {
        super(service);
    }
}
