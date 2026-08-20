package com.vhre.fleet_service.modules.vehicles.dto;

import com.vhre.fleet_service.core.base.dto.BaseDTO;
import com.vhre.fleet_service.modules.vehicles.enums.VehicleStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Data Transfer Object representing a Vehicle")
public class VehicleDTO extends BaseDTO {

    @Schema(description = "Unique license plate of the vehicle", example = "TRK-9876")
    @NotBlank(message = "The license plate is mandatory")
    private String licensePlate;

    @Schema(description = "Brand and model of the vehicle", example = "Volvo FH16")
    @NotBlank(message = "The model is mandatory")
    private String model;

    @Schema(description = "Maximum cargo capacity in tons", example = "25.5")
    @NotNull(message = "The capacity in tons is mandatory")
    @DecimalMin(value = "0.1", message = "The capacity must be greater than zero")
    private Double capacityTons;

    @Schema(description = "Current operational status of the vehicle", example = "AVAILABLE")
    @NotNull(message = "The vehicle status is mandatory")
    private VehicleStatus status;
}
