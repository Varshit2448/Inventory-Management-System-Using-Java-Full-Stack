package com.Goats.Inventory_Mananager.dtos;

import com.Goats.Inventory_Mananager.Enums.TransactionStatus;
import com.Goats.Inventory_Mananager.Enums.TransactionType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionsDTO {

    private Long id;

    private Integer totalProducts;
    private BigDecimal totalPrice;

    //@Enumerated(EnumType.STRING)
    private TransactionStatus status;

    //@Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    private String description;
    private String role;

    private LocalDateTime createdAt ;
    private LocalDateTime updatedAt;


    private ProductDTO product;

    private UserDTO user;


    private SupplierDTO supplier;

}





