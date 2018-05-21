package com.ll.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ll.entity.Account;
import com.ll.service.AccountService;

@Controller
public class AccountController {
	@Resource
	AccountService accountService;
	
	@RequestMapping("/toListAccount")
	public String toList(){
		return "account/listAccount";
	}
	@RequestMapping("/queryAccounts")
	@ResponseBody
	public Map<String, Object> listAccounts(){
		List<Account> accounts = accountService.getAccountList();
		Map<String, Object> retMap = new HashMap<>();
		retMap.put("code", 0);
		retMap.put("msg", "");
		retMap.put("count", accounts.size());
		retMap.put("data", accounts);
		return retMap;
	}
	
	@RequestMapping("/toAdd")
	public String toAdd(){
		return "account/addAccount";
	}
	@RequestMapping("/add")
	@ResponseBody
	public boolean add(@RequestBody Account account){
		try{
			accountService.addAccount(account);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	@RequestMapping("/delete")
	@ResponseBody
	public boolean deleteAccounts(@RequestBody List<Account> accounts){
		try{
			accountService.deleteAccounts(accounts);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
