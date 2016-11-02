package com.niit.clothes.dao;

import java.util.List;

import com.niit.clothes.model.Supplier;


public interface SupplierDAO {


	public List<Supplier> list();

	public Supplier get(String id);
	
	public Supplier getByName(String name);

	public void saveOrUpdate(Supplier supplier);

	public String delete(String id);


}
