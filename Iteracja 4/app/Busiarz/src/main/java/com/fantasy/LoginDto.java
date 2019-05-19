package com.fantasy;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class LoginDto {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
