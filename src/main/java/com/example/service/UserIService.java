package com.example.service;

import com.example.model.User;

public interface UserIService {
	 public void insert(User user);
	    public void update(User user);

	    public User find(int id);
	  
	    public void delete(int id);
}
