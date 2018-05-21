package com.ll.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
@Entity
public class Knowledge {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="knowledge")
	@TableGenerator(name = "knowledge", allocationSize = 1, table = "seq_table", pkColumnName = "seq_id", valueColumnName = "seq_count")
	//主键
	private Long id;
	@Column(nullable=false)
	//学习相关内容
	private String content;
	@Column(nullable=false)
	//学习方式
	private String learnMethod;
	//网址
	private String learnUrl;
	//相关文档路径
	private String filePath;
	
	public Knowledge() {
		super();
	}
	public Knowledge(String content, String learnMethod, String learnUrl, String filePath) {
		super();
		this.content = content;
		this.learnMethod = learnMethod;
		this.learnUrl = learnUrl;
		this.filePath = filePath;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLearnMethod() {
		return learnMethod;
	}
	public void setLearnMethod(String learnMethod) {
		this.learnMethod = learnMethod;
	}
	public String getLearnUrl() {
		return learnUrl;
	}
	public void setLearnUrl(String learnUrl) {
		this.learnUrl = learnUrl;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
}
