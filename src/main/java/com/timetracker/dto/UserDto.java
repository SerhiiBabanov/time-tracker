package com.timetracker.dto;

import com.timetracker.dao.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link User}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {
    private Long id;
    @NotNull
    @NotEmpty
    @NotBlank
    private String firstName;
    private String lastName;
    @NotNull
    @Email
    @NotEmpty
    @NotBlank
    private String email;
}
