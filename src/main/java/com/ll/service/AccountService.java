package com.ll.service;

import java.util.List;

import com.ll.entity.Account;

public interface AccountService {
	//根据id查询账号信息
	public Account getAccountById(long id);
	//查询所有账户信息
	public List<Account> getAccountList();
	//添加账户信息
	public void addAccount(Account account);
	//修改账户信息
	public void editAccount(Account account);
	//删除账户信息
	public void deleteById(long id);
	//批量删除账户信息
	public void deleteAccounts(List<Account> accounts);
}
