package com.tnsif.Placement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import com.tnsif.Placement.entity.Admin;
import com.tnsif.Placement.repository.AdminRepository;

@SpringBootApplication
public class PlacementApplication implements CommandLineRunner {

    @Autowired
    private AdminRepository adminRepository; // <-- autowired here

    public static void main(String[] args) {
        SpringApplication.run(PlacementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Check if admin already exists to avoid duplicates
        if (adminRepository.findByUsername("admin1") == null) {
            Admin admin = new Admin();
            admin.setUsername("admin1");
            admin.setPassword("admin123"); // Later hash this
            admin.setRole("ADMIN");

            adminRepository.save(admin);
            System.out.println("Admin saved!");
        }
    }
}
