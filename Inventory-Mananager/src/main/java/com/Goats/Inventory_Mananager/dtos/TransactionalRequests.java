package com.Goats.Inventory_Mananager.dtos;

import com.Goats.Inventory_Mananager.Enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionalRequests {

    @Positive(message = "Product ID is needed")
    private Long productId;

    @Positive(message = "Quantity is needed")
    private Integer quantity;

    private Long supplierId;

    private String description;

    private String note;
}












