package com.Goats.Inventory_Mananager.Repo;

import com.Goats.Inventory_Mananager.Models.Product;
import com.Goats.Inventory_Mananager.Models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepo extends JpaRepository<Supplier, Long> {


}
