package com.lomaev.mvc.service;

import com.lomaev.mvc.dao.UsersDAO;
import com.lomaev.mvc.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UsersDAO usersDAO;

    @Autowired
    public UserServiceImpl(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    @Override
    @Transactional
    public List<Users> getAllUsers() {
        return usersDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(Users users) {
        usersDAO.saveUser(users);
    }

    @Override
    @Transactional
    public Users getUser(int id) {
        return usersDAO.getUsers(id);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        usersDAO.deleteUser(id);

    }


}
