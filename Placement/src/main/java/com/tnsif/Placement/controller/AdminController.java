package com.tnsif.Placement.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;
	import com.tnsif.Placement.entity.Admin;
	import com.tnsif.Placement.service.AdminService;
	import java.util.List;
	
@RestController
@RequestMapping("/admins")
public class AdminController 
{
	
	@Autowired
	private AdminService adminService;
	
	 @GetMapping
	 public List<Admin> getAllAdmins() 
	 {
	     return adminService.getAllAdmins();
	 }
	 
	 @GetMapping("/{id}")
	 public Admin getAdminById(@PathVariable Long id) 
	 {
	     return adminService.getAdminById(id);
	 }

	 @PostMapping
	 public Admin addAdmin(@RequestBody Admin admin) 
	 {
	     return adminService.addAdmin(admin);
	 }

	 @PutMapping("/{id}")
	 public Admin updateAdmin(@PathVariable Long id, @RequestBody Admin admin) 
	 {
	     return adminService.updateAdmin(id, admin);
	 }

	 @DeleteMapping("/{id}")
	  public void deleteAdmin(@PathVariable Long id) 
	 {
	     adminService.deleteAdmin(id);
	 }
	
}
