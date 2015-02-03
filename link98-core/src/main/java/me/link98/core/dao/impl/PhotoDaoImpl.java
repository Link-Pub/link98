package me.link98.core.dao.impl;

import org.springframework.stereotype.Component;
import me.link98.core.domains.Photo;
import me.link98.core.dao.PhotoDao;

@Component
public class PhotoDaoImpl extends AbstractDao<Photo> implements PhotoDao{

	@Override
	protected String getNameSapce() {
		return "me.link98.core.domains.Photo";
	}
}
