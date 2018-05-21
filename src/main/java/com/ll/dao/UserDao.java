package com.ll.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ll.entity.User;

public interface UserDao extends JpaRepository<User, Long>{
	 User findById(long id);

	 void deleteById(Long id);
	 
	 User findByUserNameAndPassword(String userName,String password);
}
