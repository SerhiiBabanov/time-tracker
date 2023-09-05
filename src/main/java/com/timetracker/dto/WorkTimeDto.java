package com.timetracker.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.timetracker.dao.WorkTime}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkTimeDto implements Serializable {
    private Long id;
    private WorkerDto workerDto;
    @NotNull
    private LocalDateTime start;
    @NotNull
    private LocalDateTime end;
    private Duration bonus;
    private Duration time;
    @NotNull
    private Long workerId;
}
