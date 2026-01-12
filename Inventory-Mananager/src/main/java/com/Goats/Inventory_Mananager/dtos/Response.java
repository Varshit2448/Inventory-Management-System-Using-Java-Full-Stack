package com.Goats.Inventory_Mananager.dtos;

import com.Goats.Inventory_Mananager.Enums.UserRole;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Builder   // 🔥 THIS IS REQUIRED
public class Response {

    private int status;
    private String message;

    private String token;
    private UserRole role;
    private String expirationTime;

    private Integer totalPages;
    private Long totalElements;

    private UserDTO user;
    private List<UserDTO> users;

    private SupplierDTO supplier;
    private List<SupplierDTO> suppliers;

    private CatagoryDTO category;
    private List<CatagoryDTO> categories;

    private ProductDTO product;
    private List<ProductDTO> products;

    private TransactionsDTO transaction;
    private List<TransactionsDTO> transactions;

    private LocalDateTime timestamp;
}
