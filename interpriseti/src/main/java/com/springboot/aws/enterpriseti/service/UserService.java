package com.springboot.aws.enterpriseti.service;

import java.util.List;

import com.springboot.aws.enterpriseti.entity.Usuario;

public interface UserService {

	List<Usuario> getUserList();
	Long addUser(Usuario user);
	Usuario getUser(Long id);
	boolean delete(Long id);
	boolean update(Long id, Usuario user);
	Long totalUsers();
	List<Usuario> getListCursorUsers(String alias);
}
