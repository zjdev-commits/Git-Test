package com.example.demo.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
   public String getPassWordByUid(String uid);
}
