package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.CategoryMaster;
import com.hllinventory.demo.model.DocumentMaster;
/**
 * @author Surekha Londhe
 * @Date 18-12-2020
 */
public interface CategoryMasterDao {
	public void saveCategory(CategoryMaster category);

	public CategoryMaster getCategory(int categoryId);

	public void updateCategory(CategoryMaster category);

	public List<CategoryMaster> getAllCategory();

}
