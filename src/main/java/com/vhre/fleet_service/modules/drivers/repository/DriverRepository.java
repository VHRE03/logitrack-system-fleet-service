package com.vhre.fleet_service.modules.drivers.repository;

import com.vhre.fleet_service.modules.drivers.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DriverRepository extends JpaRepository<Driver, UUID> {
}
