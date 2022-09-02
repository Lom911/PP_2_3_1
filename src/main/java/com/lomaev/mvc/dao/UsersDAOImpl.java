package com.lomaev.mvc.dao;

import com.lomaev.mvc.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UsersDAOImpl implements UsersDAO {

private final SessionFactory sessionFactory;
@Autowired
    public UsersDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Users> getAllUsers() {

        Session session = sessionFactory.getCurrentSession();
//        List<Users> allUsers = session.createQuery("from Users", Users.class).getResultList();
//        return allUsers;
        Query<Users> query = session.createQuery("from Users", Users.class);
        List<Users> allUsers = query.getResultList();
        return allUsers;
    }

    @Override
    public void saveUser(Users users) {
        Session session = sessionFactory.getCurrentSession();
        session.save(users);
    }
}
