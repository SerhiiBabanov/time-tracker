package com.timetracker.dto;

import com.timetracker.dao.Team;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * DTO for {@link Team}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamDto implements Serializable {
    private Long id;
    @NotNull
    @NotEmpty
    @NotBlank
    private String name;
    private Long userId;
    private List<WorkerDto> workers = new ArrayList<>();
}
