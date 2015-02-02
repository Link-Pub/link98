package me.link98.core.service;

import org.springframework.transaction.annotation.Transactional;

import me.link98.core.domains.Users;

@Transactional
public interface UsersService extends BaseService<Users>{
}
