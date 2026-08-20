package com.vhre.fleet_service.modules.vehicles.entity;

import com.vhre.fleet_service.core.base.entity.BaseEntity;
import com.vhre.fleet_service.modules.routes.entity.Route;
import com.vhre.fleet_service.modules.vehicles.enums.VehicleStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "vehicles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle extends BaseEntity {

    @Column(name = "license_plate", length = 20, unique = true)
    private String licensePlate;

    @Column(length = 100)
    private String model;

    @Column(name = "capacity_tons")
    private Double capacityTons;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private VehicleStatus status;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Route> routes;
}
