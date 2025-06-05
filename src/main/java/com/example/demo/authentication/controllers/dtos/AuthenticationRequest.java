package com.example.demo.authentication.controllers.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthenticationRequest {
    @NotBlank(message = "email must be not null")
    String email;
    @NotBlank(message = "password must be not null")
    String password;

}