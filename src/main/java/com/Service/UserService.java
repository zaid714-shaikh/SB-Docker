package com.Service;

import com.Entity.User;
import com.Repository.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepo ur;


    public User registerUser(User user) {

        log.info("I am in Service  :- " + user);

        User us = ur.save(user);

        return us;
    }

    public List<User> getUserInService() {

        return ur.findAll();

    }

    public User UpdateUser(User user, int id) {

        User u = ur.findById(id).get();

        u.setUaddress(user.getUaddress());
        u.setUage(user.getUage());


        return ur.save(u);


    }

    public void DeleteUser(int id) {

        ur.deleteById(id);

    }
}
