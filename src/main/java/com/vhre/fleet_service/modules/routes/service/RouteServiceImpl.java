package com.vhre.fleet_service.modules.routes.service;

import com.vhre.fleet_service.core.base.service.BaseServiceImpl;
import com.vhre.fleet_service.modules.routes.dto.RouteDTO;
import com.vhre.fleet_service.modules.routes.entity.Route;
import com.vhre.fleet_service.modules.routes.mapper.RouteMapper;
import com.vhre.fleet_service.modules.routes.repository.RouteRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RouteServiceImpl extends BaseServiceImpl<Route, RouteDTO, UUID> implements RouteService {
    public RouteServiceImpl(RouteRepository repository, RouteMapper mapper) {
        super(repository, mapper);
    }
}
