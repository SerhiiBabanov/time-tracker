package com.timetracker.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.timetracker.dao.Worker}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkerDto implements Serializable {
    private Long id;
    @NotNull
    @NotEmpty
    @NotBlank
    private String firstName;
    private String lastName;
    @NotNull
    @Digits(integer = 3, fraction = 2)
    private BigDecimal rate;
    private Long teamId;
}
