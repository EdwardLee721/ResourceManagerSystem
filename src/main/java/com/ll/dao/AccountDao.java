package com.ll.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ll.entity.Account;

public interface AccountDao extends JpaRepository<Account, Long>{
	Account findById(long id);
	void deleteById(long id);
}
