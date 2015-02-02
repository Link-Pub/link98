package me.link98.core.service;

import org.springframework.transaction.annotation.Transactional;

import me.link98.core.domains.Photo;

@Transactional
public interface PhotoService extends BaseService<Photo>{
}
