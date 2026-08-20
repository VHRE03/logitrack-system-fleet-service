package com.vhre.fleet_service.modules.routes.dto;

import com.vhre.fleet_service.core.base.dto.BaseDTO;
import com.vhre.fleet_service.modules.routes.enums.RouteStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Data Transfer Object representing a dispatch Route")
public class RouteDTO extends BaseDTO {

    @Schema(description = "ID of the assigned vehicle for this route", example = "123e4567-e89b-12d3-a456-426614174000")
    @NotNull(message = "The vehicle ID is mandatory")
    private UUID vehicleId;

    @Schema(description = "ID of the assigned driver for this route", example = "987e6543-e21b-12d3-a456-426614174999")
    @NotNull(message = "The driver ID is mandatory")
    private UUID driverId;

    @Schema(description = "Starting point or origin location of the route", example = "Central Warehouse, NY")
    @NotBlank(message = "The origin is mandatory")
    private String origin;

    @Schema(description = "Final destination of the delivery", example = "Distribution Center, NJ")
    @NotBlank(message = "The destination is mandatory")
    private String destination;

    @Schema(description = "Current operational status of the route", example = "PENDING")
    @NotNull(message = "The route status is mandatory")
    private RouteStatus status;
}
