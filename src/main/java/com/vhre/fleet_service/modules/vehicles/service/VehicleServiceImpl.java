package com.vhre.fleet_service.modules.vehicles.service;

import com.vhre.fleet_service.core.base.service.BaseServiceImpl;
import com.vhre.fleet_service.modules.vehicles.dto.VehicleDTO;
import com.vhre.fleet_service.modules.vehicles.entity.Vehicle;
import com.vhre.fleet_service.modules.vehicles.mapper.VehicleMapper;
import com.vhre.fleet_service.modules.vehicles.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VehicleServiceImpl extends BaseServiceImpl<Vehicle, VehicleDTO, UUID> implements VehicleService {
    public VehicleServiceImpl(VehicleRepository repository, VehicleMapper mapper) {
        super(repository, mapper);
    }
}
