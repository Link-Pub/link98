package me.link98.core.dao.impl;

import org.springframework.stereotype.Component;
import me.link98.core.domains.Diary;
import me.link98.core.dao.DiaryDao;

@Component
public class DiaryDaoImpl extends AbstractDao<Diary> implements DiaryDao{

	@Override
	protected String getNameSapce() {
		return "me.link98.core.domains.Diary";
	}
}
