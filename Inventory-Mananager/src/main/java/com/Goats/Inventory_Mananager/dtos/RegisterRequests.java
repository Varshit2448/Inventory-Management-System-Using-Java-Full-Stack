package com.Goats.Inventory_Mananager.dtos;

import com.Goats.Inventory_Mananager.Enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequests {

    @NotBlank(message = "Name is Required")
    private String name;

    @NotBlank(message = "Email is Required")
    private String email;

    private UserRole role;

    @NotBlank(message = "Password is Required")
    private String password;

}
