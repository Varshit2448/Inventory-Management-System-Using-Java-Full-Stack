package com.Goats.Inventory_Mananager.Security;

import com.Goats.Inventory_Mananager.Exceptions.NotFoundException;
import com.Goats.Inventory_Mananager.Models.User;
import com.Goats.Inventory_Mananager.Repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CustomUserDetailService implements UserDetailsService {


    private final UserRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username).orElseThrow(() -> new NotFoundException("User Email Not Found"));
        return AuthUser.builder()
                .user(user)
                .build();
    }
}
