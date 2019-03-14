package com.hong.dao.system;

import com.hong.model.system.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<SystemUser,Integer>{
}
