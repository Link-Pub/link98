package me.link98.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.link98.core.domains.Essay;
import me.link98.core.dao.BaseDao;
import me.link98.core.dao.EssayDao;
import me.link98.core.service.EssayService;

@Component
public class EssayServiceImpl extends AbstractService<Essay> implements EssayService{
	@Autowired
	private EssayDao dao;

	@Override
	protected BaseDao<Essay> getDao() {
		return dao;
	}
}
