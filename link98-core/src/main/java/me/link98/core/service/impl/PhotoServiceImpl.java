package me.link98.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.link98.core.domains.Photo;
import me.link98.core.dao.BaseDao;
import me.link98.core.dao.PhotoDao;
import me.link98.core.service.PhotoService;

@Component
public class PhotoServiceImpl extends AbstractService<Photo> implements PhotoService{
	@Autowired
	private PhotoDao dao;

	@Override
	protected BaseDao<Photo> getDao() {
		return dao;
	}
}
