package com.kouach.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kouach.exam.entities.Article;
@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer>{
	

}
