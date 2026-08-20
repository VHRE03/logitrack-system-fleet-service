package com.vhre.fleet_service.modules.drivers.service;

import com.vhre.fleet_service.core.base.service.BaseServiceImpl;
import com.vhre.fleet_service.modules.drivers.dto.DriverDTO;
import com.vhre.fleet_service.modules.drivers.entity.Driver;
import com.vhre.fleet_service.modules.drivers.mapper.DriverMapper;
import com.vhre.fleet_service.modules.drivers.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DriverServiceImpl extends BaseServiceImpl<Driver, DriverDTO, UUID> implements DriverService {
    public DriverServiceImpl(DriverRepository repository, DriverMapper mapper) {
        super(repository, mapper);
    }
}
