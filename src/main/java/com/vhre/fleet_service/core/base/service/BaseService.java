package com.vhre.fleet_service.core.base.service;

import java.util.List;

public interface BaseService<Dto, ID> {
    List<Dto> findAll();

    Dto findById(ID id);

    Dto save(Dto dto);

    Dto update(ID id, Dto dto);

    void delete(ID id);
}
