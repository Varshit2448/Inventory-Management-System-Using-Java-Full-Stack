package com.Goats.Inventory_Mananager.Repo;

import com.Goats.Inventory_Mananager.Models.Product;
import com.Goats.Inventory_Mananager.Models.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface TransactionRepo extends JpaRepository<Transactions, Long>, JpaSpecificationExecutor<Transactions> {

}
