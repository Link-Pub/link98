package me.link98.core.service;

import org.springframework.transaction.annotation.Transactional;

import me.link98.core.domains.Diary;

@Transactional
public interface DiaryService extends BaseService<Diary>{
}
