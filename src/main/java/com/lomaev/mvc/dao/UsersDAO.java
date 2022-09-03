package com.lomaev.mvc.dao;

import com.lomaev.mvc.entity.Users;

import java.util.List;

public interface UsersDAO {


    public List<Users> getAllUsers();

   public void saveUser(Users users);

    public Users getUsers(int id);

   public void deleteUser(int id);
}
