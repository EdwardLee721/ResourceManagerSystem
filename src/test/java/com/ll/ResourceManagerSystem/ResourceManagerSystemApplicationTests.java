package com.ll.ResourceManagerSystem;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ll.dao.AccountDao;
import com.ll.dao.KnowledgeDao;
import com.ll.dao.UserDao;
import com.ll.entity.Account;
import com.ll.entity.Knowledge;
import com.ll.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResourceManagerSystemApplicationTests {
	@Autowired
	UserDao userDao;
	@Autowired
	AccountDao accountDao;
	@Autowired
	KnowledgeDao knowledgeDao;
	@Test
	public void test() {
		/*userDao.save(new User("ll", "123145", new Date(System.currentTimeMillis())));
		accountDao.save(new Account( "新浪微博", "13257003450", "123456", new Date(System.currentTimeMillis())));
		knowledgeDao.save(new Knowledge("Spring Boot学习", "博客", "www.baidu.com", ""));*/
		User user = userDao.findById(1);
		System.out.println(user.toString());
		Account account = accountDao.findById(1);
	}

}
