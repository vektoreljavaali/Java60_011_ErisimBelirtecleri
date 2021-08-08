package com.vektorel.util;

import java.util.List;

public interface ICrud {

	void Save();
	void Update();
	void Delete(long id);
	List<Object> findAll();
	Object findById(long id);
	List<Object> findList(Object o);
}
