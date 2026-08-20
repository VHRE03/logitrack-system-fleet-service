package com.vhre.fleet_service.modules.drivers.controller;

import com.vhre.fleet_service.core.base.controller.BaseController;
import com.vhre.fleet_service.modules.drivers.dto.DriverDTO;
import com.vhre.fleet_service.modules.drivers.entity.Driver;
import com.vhre.fleet_service.modules.drivers.service.DriverService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/drivers")
@Tag(name = "Driver Management", description = "Endpoints for managing fleet drivers, their profiles, and operational status")
public class DriverController extends BaseController<Driver, DriverDTO, UUID> {
    public DriverController(DriverService service) {
        super(service);
    }
}
