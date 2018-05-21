package com.ll.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="account")
	@TableGenerator(name = "account", allocationSize = 1, table = "seq_table", pkColumnName = "seq_id", valueColumnName = "seq_count")
	//主键
	private long id;
	@Column(nullable=true)
	//应用名称
	private String appName;
	@Column(nullable=true)
	//登录名称
	private String loginName;
	@Column(nullable=true)
	//登录密码
	private String loginPwd;
	@Column(nullable=true)
	//添加时间
	private Date recordTime;
	
	public Account() {
		super();
	}
	public Account( String appName, String loginName, String loginPwd, Date recordTime) {
		super();
		this.appName = appName;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.recordTime = recordTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public Date getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(Date recordTime) {
		this.recordTime = recordTime;
	}
	
}
