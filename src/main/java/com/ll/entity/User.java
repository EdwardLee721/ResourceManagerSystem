package com.ll.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="user")
	@TableGenerator(name = "user", allocationSize = 1, table = "seq_table", pkColumnName = "seq_id", valueColumnName = "seq_count")
	private long id;
	@Column
	private String userName;
	@Column
	private String password;
	@Column
	private Date createTime;
	
	public User() {
		super();
	}
	public User(String userName, String password, Date createTime) {
		super();
		this.userName = userName;
		this.password = password;
		this.createTime = createTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
