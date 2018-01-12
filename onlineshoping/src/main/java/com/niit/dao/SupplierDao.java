package com.niit.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.model.Supplier;

@Repository("supplierDAO")
public interface SupplierDao {
	List<Supplier> getAllSupplier();
	Supplier getSupplier(int supid);
	void deleteSupplier(int supid);
	void addorupdatesupplier(Supplier su);
}
