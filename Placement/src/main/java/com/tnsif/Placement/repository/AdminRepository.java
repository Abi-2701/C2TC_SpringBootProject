package com.tnsif.Placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.Placement.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>
{
    Admin findByUsername(String username); // custom query
}
