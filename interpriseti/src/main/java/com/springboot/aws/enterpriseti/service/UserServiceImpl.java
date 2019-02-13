package com.springboot.aws.enterpriseti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springboot.aws.enterpriseti.dao.UserDao;
import com.springboot.aws.enterpriseti.entity.Usuario;

@Service("usuarioService")
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("usuarioDao")
	UserDao userDaoImpl;
	
	@Override
	public List<Usuario> getUserList() {
		return userDaoImpl.getUserList();
	}

	@Override
	public Long addUser(Usuario user) {
		return userDaoImpl.addUser(user);
	}

	@Override
	public Usuario getUser(Long id) {
		return userDaoImpl.getUser(id);
	}

	@Override
	public boolean delete(Long id) {
		return userDaoImpl.delete(id);
	}

	@Override
	public boolean update(Long id, Usuario user) {
		return userDaoImpl.update(id, user);
	}

	@Override
	public Long totalUsers() {
		return userDaoImpl.totalUsers();
	}

	@Override
	public List<Usuario> getListCursorUsers(String alias) {
		return getListCursorUsers(alias);
	}

}
