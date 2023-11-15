package com.kouach.exam.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kouach.exam.dao.IDao;
import com.kouach.exam.entities.Article;
import com.kouach.exam.repositories.ArticleRepository;

@Service
public class ArticleService implements IDao<Article>{
	
	private ArticleRepository repository;

	@Override
	public Article create(Article o) {
		return repository.save(o);
	}

	@Override
	public boolean delete(Article o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Article update(Article o) {
		return repository.save(o);
	}

	@Override
	public Article findById(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Article> findAll() {
		return repository.findAll();
	}
	

}
