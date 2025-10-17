package com.tnsif.Placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.Placement.entity.Admin;
import com.tnsif.Placement.repository.AdminRepository;
import java.util.List;

@Service
public class AdminService 
{

	@Autowired
	private AdminRepository adminRepository;

    public List<Admin> getAllAdmins() 
    {
        return adminRepository.findAll();
    }

    public Admin getAdminById(Long id) 
    {
        return adminRepository.findById(id).orElse(null);
    }

    public Admin addAdmin(Admin admin) 
    {
        return adminRepository.save(admin);
    }

    public Admin updateAdmin(Long id, Admin adminDetails) 
    {
        Admin admin = adminRepository.findById(id).orElse(null);
        if (admin != null) 
        {
            admin.setUsername(adminDetails.getUsername());
            admin.setPassword(adminDetails.getPassword());
            admin.setRole(adminDetails.getRole());
            return adminRepository.save(admin);
        }
        return null;
    }

    public void deleteAdmin(Long id) 
    {
        adminRepository.deleteById(id);
    }
}