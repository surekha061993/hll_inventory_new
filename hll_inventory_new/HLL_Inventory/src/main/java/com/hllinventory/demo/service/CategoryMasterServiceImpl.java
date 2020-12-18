package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.CategoryMasterDao;
import com.hllinventory.demo.model.CategoryMaster;

/**
 * @author Surekha Londhe
 * @Date 18-12-2020
 */
@Service
public class CategoryMasterServiceImpl implements CategoryMasterService {

	@Autowired
	private CategoryMasterDao categoryDao;
	
	@Override
	public void saveCategory(CategoryMaster category) {
		category.setCategoryStatus("Y");
		categoryDao.saveCategory(category);
	}

	@Override
	public CategoryMaster getCategory(int categoryId) {
		return categoryDao.getCategory(categoryId);
		}

	@Override
	public List<CategoryMaster> getAllCategory() {
		List<CategoryMaster> list=categoryDao.getAllCategory();
		return list;
	}

	@Override
	public CategoryMaster deleteCategory(CategoryMaster category) {
		category.setCategoryStatus("N");
		categoryDao.updateCategory(category);
		return category;
	}

	@Override
	public void updateCategory(CategoryMaster category) {
		categoryDao.updateCategory(category);
	}

}
