package com.Goats.Inventory_Mananager.Repo;

import com.Goats.Inventory_Mananager.Models.Product;
import com.Goats.Inventory_Mananager.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
