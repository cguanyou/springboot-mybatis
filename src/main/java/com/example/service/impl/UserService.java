package com.example.service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.model.User;
import com.example.service.UserIService;
@ComponentScan({"com.example.mapper"})
@Service("userService")
public class UserService implements UserIService {
	@Resource
    private UserMapper userMapper;
	@Override
	public void insert(User user) {
		userMapper.insert(user);

	}

	@Override
	public void update(User user) {
		userMapper.update(user);

	}

	@Override
	public User find(int id) {
		return userMapper.find(id);
	}

	@Override
	public void delete(int id) {
		userMapper.delete(id);

	}

}
