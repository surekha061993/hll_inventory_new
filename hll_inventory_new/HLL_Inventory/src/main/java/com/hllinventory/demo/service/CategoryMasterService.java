package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.CategoryMaster;
import com.hllinventory.demo.model.DocumentMaster;

/**
 * @author Surekha Londhe
 * @Date 18-12-2020
 */
public interface CategoryMasterService {
	public void saveCategory(CategoryMaster category);

	public CategoryMaster getCategory(int categoryId);

	public List<CategoryMaster> getAllCategory();

	public CategoryMaster deleteCategory(CategoryMaster category);

	public void updateCategory(CategoryMaster category);

}
