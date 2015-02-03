package me.link98.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.link98.core.domains.UserBehavior;
import me.link98.core.dao.BaseDao;
import me.link98.core.dao.UserBehaviorDao;
import me.link98.core.service.UserBehaviorService;

@Component
public class UserBehaviorServiceImpl extends AbstractService<UserBehavior> implements UserBehaviorService{
	@Autowired
	private UserBehaviorDao dao;

	@Override
	protected BaseDao<UserBehavior> getDao() {
		return dao;
	}
}
