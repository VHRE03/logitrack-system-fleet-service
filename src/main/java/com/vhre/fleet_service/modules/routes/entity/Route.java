package com.vhre.fleet_service.modules.routes.entity;

import com.vhre.fleet_service.core.base.entity.BaseEntity;
import com.vhre.fleet_service.modules.drivers.entity.Driver;
import com.vhre.fleet_service.modules.routes.enums.RouteStatus;
import com.vhre.fleet_service.modules.vehicles.entity.Vehicle;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "routes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Route extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;

    @Column(length = 255, nullable = false)
    private String origin;

    @Column(length = 255, nullable = false)
    private String destination;

    @Enumerated(EnumType.STRING)
    @Column(length = 30, nullable = false)
    private RouteStatus status;
}
