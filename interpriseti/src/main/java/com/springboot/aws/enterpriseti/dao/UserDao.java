package com.springboot.aws.enterpriseti.dao;

import java.util.List;

import com.springboot.aws.enterpriseti.entity.Usuario;

public interface UserDao {

	List<Usuario> getUserList();
	Long addUser(Usuario user);
	Usuario getUser(Long id);
	boolean delete(Long id);
	boolean update(Long id, Usuario user);
	Long totalUsers();
	List<Usuario> getListCursorUsers(String alias);
	
	
}
