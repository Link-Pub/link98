package me.link98.core.service;

import org.springframework.transaction.annotation.Transactional;

import me.link98.core.domains.UserBehavior;

@Transactional
public interface UserBehaviorService extends BaseService<UserBehavior>{
}
