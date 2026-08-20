package com.vhre.fleet_service.modules.routes.controller;

import com.vhre.fleet_service.core.base.controller.BaseController;
import com.vhre.fleet_service.modules.routes.dto.RouteDTO;
import com.vhre.fleet_service.modules.routes.entity.Route;
import com.vhre.fleet_service.modules.routes.service.RouteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/routes")
@Tag(name = "Route Management", description = "Endpoints for managing dispatch routes, assigning vehicles and drivers for deliveries")
public class RouteController extends BaseController<Route, RouteDTO, UUID> {

    public RouteController(RouteService service) {
        super(service);
    }
}