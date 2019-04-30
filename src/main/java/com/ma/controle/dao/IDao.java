package com.ma.controle.dao;

import java.util.List;

public interface IDao<T> {
	public List<T> findAll();
	public T findById(int id);
	public void create(T o);
	public void update(T o);
	public void delete(T o);
}
