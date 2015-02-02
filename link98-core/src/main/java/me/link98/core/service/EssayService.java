package me.link98.core.service;

import org.springframework.transaction.annotation.Transactional;

import me.link98.core.domains.Essay;

@Transactional
public interface EssayService extends BaseService<Essay>{
}
