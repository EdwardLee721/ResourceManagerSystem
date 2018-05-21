package com.ll.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ll.entity.Knowledge;

public interface KnowledgeDao extends JpaRepository<Knowledge, Long>{
	Knowledge findById(long id);
	void deleteById(long id);
}
