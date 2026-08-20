package com.vhre.fleet_service.modules.vehicles.mapper;

import com.vhre.fleet_service.core.base.mapper.BaseMapper;
import com.vhre.fleet_service.modules.vehicles.dto.VehicleDTO;
import com.vhre.fleet_service.modules.vehicles.entity.Vehicle;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface VehicleMapper extends BaseMapper<Vehicle, VehicleDTO> {

    @Override
    VehicleDTO toDto(Vehicle vehicle);

    @Override
    @Mapping(target = "routes", ignore = true)
    Vehicle toEntity(VehicleDTO dto);
}
