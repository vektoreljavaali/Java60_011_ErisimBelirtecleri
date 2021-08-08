package com.vektorel.repository;

import java.util.List;

import com.vektorel.entity.Urun;
import com.vektorel.util.ICrud;

public class UrunRepository implements ICrud{

	@Override
	public void Save() {
		Urun urun = new Urun();
		urun.setAd("Þeker");
		
		
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> findList(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
