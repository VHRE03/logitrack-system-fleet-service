package com.vhre.fleet_service.core.base.mapper;

import java.util.List;

public interface BaseMapper<Entity, Dto> {
    Dto toDto(Entity entity);

    Entity toEntity(Dto dto);

    List<Dto> toDtos(List<Entity> entities);

    List<Entity> toEntities(List<Dto> dtos);
}
