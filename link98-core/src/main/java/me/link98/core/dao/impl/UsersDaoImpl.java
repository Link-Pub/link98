package me.link98.core.dao.impl;

import org.springframework.stereotype.Component;
import me.link98.core.domains.Users;
import me.link98.core.dao.UsersDao;

@Component
public class UsersDaoImpl extends AbstractDao<Users> implements UsersDao{

	@Override
	protected String getNameSapce() {
		return "me.link98.core.domains.Users";
	}
}
