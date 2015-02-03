package me.link98.core.dao.impl;

import org.springframework.stereotype.Component;
import me.link98.core.domains.UserBehavior;
import me.link98.core.dao.UserBehaviorDao;

@Component
public class UserBehaviorDaoImpl extends AbstractDao<UserBehavior> implements UserBehaviorDao{

	@Override
	protected String getNameSapce() {
		return "me.link98.core.domains.UserBehavior";
	}
}
