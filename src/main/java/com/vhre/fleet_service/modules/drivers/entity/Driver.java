package com.vhre.fleet_service.modules.drivers.entity;

import com.vhre.fleet_service.core.base.entity.BaseEntity;
import com.vhre.fleet_service.modules.drivers.enums.DriverStatus;
import com.vhre.fleet_service.modules.routes.entity.Route;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "drivers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseEntity {

    @Column(name = "license_number", length = 50, unique = true)
    private String licenseNumber;

    @Column(name = "first_name", length = 100)
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private DriverStatus status;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Route> routes;
}
