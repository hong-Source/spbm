package com.hong.dao.system;

import com.hong.model.system.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User,Integer>{
}
