package com.ll.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ll.dao.AccountDao;
import com.ll.entity.Account;
import com.ll.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountDao accountDao;
	@Override
	public Account getAccountById(long id) {
		return accountDao.findById(id);
	}
	@Override
	public List<Account> getAccountList() {
		return accountDao.findAll();
	}

	@Override
	public void addAccount(Account account) {
		accountDao.save(account);
	}

	@Override
	public void deleteById(long id) {
		accountDao.deleteById(id);
	}
	@Override
	public void editAccount(Account account) {
		accountDao.save(account);
	}

}
