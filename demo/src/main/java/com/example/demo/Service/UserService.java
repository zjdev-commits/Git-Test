package com.example.demo.Service;

import com.example.demo.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public boolean isMatch(String id,String pass){
        return  pass==userDao.getPassWordByUid(id);
    }
}
