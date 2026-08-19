package com.vhre.fleet_service.core.base.service;

import com.vhre.fleet_service.core.base.mapper.BaseMapper;
import com.vhre.fleet_service.core.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@RequiredArgsConstructor
public abstract class BaseServiceImpl<Entity, Dto, ID> implements BaseService<Dto, ID> {

    protected final JpaRepository<Entity, ID> repository;
    protected final BaseMapper<Entity, Dto> mapper;

    @Override
    public List<Dto> findAll() {
        return mapper.toDtos(repository.findAll());
    }

    @Override
    public Dto findById(ID id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElseThrow(() -> new ResourceNotFoundException("Resource not found with ID: " + id));
    }

    @Override
    public Dto save(Dto dto) {
        Entity entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public Dto update(ID id, Dto dto) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Resource not found for update with ID: " + id);
        }

        Entity entity = mapper.toEntity(dto);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void delete(ID id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Resource not found for deletion with ID: " + id);
        }
        repository.deleteById(id);
    }
}
