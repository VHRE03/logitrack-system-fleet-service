package com.vhre.fleet_service.modules.drivers.dto;

import com.vhre.fleet_service.core.base.dto.BaseDTO;
import com.vhre.fleet_service.modules.drivers.enums.DriverStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(description = "Data Transfer Object representing a Driver")
public class DriverDTO extends BaseDTO {

    @Schema(description = "Unique driver's license number", example = "DL-987654321")
    @NotBlank(message = "The license number is mandatory")
    private String licenseNumber;

    @Schema(description = "First name of the driver", example = "John")
    @NotBlank(message = "The first name is mandatory")
    private String firstName;

    @Schema(description = "Last name of the driver", example = "Doe")
    @NotBlank(message = "The last name is mandatory")
    private String lastName;

    @Schema(description = "Current operational status of the driver", example = "AVAILABLE")
    @NotNull(message = "The driver status is mandatory")
    private DriverStatus status;
}
