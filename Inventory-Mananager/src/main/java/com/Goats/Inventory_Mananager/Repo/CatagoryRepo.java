package com.Goats.Inventory_Mananager.Repo;

import com.Goats.Inventory_Mananager.Models.Catagory;
import com.Goats.Inventory_Mananager.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatagoryRepo extends JpaRepository<Catagory, Long> {

}
