package com.vhre.fleet_service.modules.drivers.mapper;

import com.vhre.fleet_service.core.base.mapper.BaseMapper;
import com.vhre.fleet_service.modules.drivers.dto.DriverDTO;
import com.vhre.fleet_service.modules.drivers.entity.Driver;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", builder = @Builder(disableBuilder = true))
public interface DriverMapper extends BaseMapper<Driver, DriverDTO> {

    @Override
    DriverDTO toDto(Driver entity);

    @Override
    @Mapping(target = "routes", ignore = true)
    Driver toEntity(DriverDTO dto);
}
