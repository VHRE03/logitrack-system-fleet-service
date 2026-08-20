package com.vhre.fleet_service.modules.routes.mapper;

import com.vhre.fleet_service.core.base.mapper.BaseMapper;
import com.vhre.fleet_service.modules.routes.dto.RouteDTO;
import com.vhre.fleet_service.modules.routes.entity.Route;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface RouteMapper extends BaseMapper<Route, RouteDTO> {

    @Override
    @Mapping(source = "vehicle.id", target = "vehicleId")
    @Mapping(source = "driver.id", target = "driverId")
    RouteDTO toDto(Route entity);

    @Override
    @Mapping(source = "vehicleId", target = "vehicle.id")
    @Mapping(source = "driverId", target = "driver.id")
    Route toEntity(RouteDTO dto);
}
