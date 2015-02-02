package me.link98.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.link98.core.domains.Users;
import me.link98.core.dao.BaseDao;
import me.link98.core.dao.UsersDao;
import me.link98.core.service.UsersService;

@Component
public class UsersServiceImpl extends AbstractService<Users> implements UsersService{
	@Autowired
	private UsersDao dao;

	@Override
	protected BaseDao<Users> getDao() {
		return dao;
	}
}
