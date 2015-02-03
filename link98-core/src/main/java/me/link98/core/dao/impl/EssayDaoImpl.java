package me.link98.core.dao.impl;

import org.springframework.stereotype.Component;
import me.link98.core.domains.Essay;
import me.link98.core.dao.EssayDao;

@Component
public class EssayDaoImpl extends AbstractDao<Essay> implements EssayDao{

	@Override
	protected String getNameSapce() {
		return "me.link98.core.domains.Essay";
	}
}
