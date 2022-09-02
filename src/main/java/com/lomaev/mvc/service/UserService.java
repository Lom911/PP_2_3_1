package com.lomaev.mvc.service;

import com.lomaev.mvc.entity.Users;

import java.util.List;

public interface UserService {
    public List<Users> getAllUsers();

    public void saveUser(Users users);
}
