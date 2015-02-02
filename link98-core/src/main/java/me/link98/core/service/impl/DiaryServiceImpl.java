package me.link98.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import me.link98.core.domains.Diary;
import me.link98.core.dao.BaseDao;
import me.link98.core.dao.DiaryDao;
import me.link98.core.service.DiaryService;

@Component
public class DiaryServiceImpl extends AbstractService<Diary> implements DiaryService{
	@Autowired
	private DiaryDao dao;

	@Override
	protected BaseDao<Diary> getDao() {
		return dao;
	}
}
