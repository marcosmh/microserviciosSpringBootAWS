package com.springboot.aws.enterpriseti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.aws.enterpriseti.entity.Usuario;
import com.springboot.aws.enterpriseti.service.UserServiceImpl;

@RestController
@RequestMapping("uri")
public class UserController {

	@Autowired
	@Qualifier("usuarioService")
	UserServiceImpl userServiceImpl;
	
	@GetMapping(path="/users",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> getListUsers() {
		System.out.println("TOTAL USUARIOS:" +  userServiceImpl.totalUsers());
		System.out.println("TOTAL USUARIOS -  CURSOR:" +  userServiceImpl.getListCursorUsers("Luis").size());
		return userServiceImpl.getUserList();
	}
	
	@GetMapping(path="/user/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Usuario getUserId(@PathVariable Long id){
		return userServiceImpl.getUser(id);
	}
	
	
	@PostMapping(path="/user")
	public ResponseEntity<?> save(@RequestBody Usuario user) {
		Long id =  userServiceImpl.addUser(user);
		return ResponseEntity.ok().body("USER NEW SAVE" +  id);
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		userServiceImpl.delete(id);
		return ResponseEntity.ok("DELETE USER SUCCESFULLY");
	}
	
	@PutMapping("/user/{id}	")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Usuario user) {
		userServiceImpl.update(id, user);
		return ResponseEntity.ok("UPDATE USER SUCCESFULLY");
	}
	
	
}
