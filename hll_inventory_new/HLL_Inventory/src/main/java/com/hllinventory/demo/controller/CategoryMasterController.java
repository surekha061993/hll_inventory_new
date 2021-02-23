package com.hllinventory.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hllinventory.demo.model.CategoryMaster;
import com.hllinventory.demo.model.PackingMaster;
import com.hllinventory.demo.service.CategoryMasterService;

/**
 * @author Surekha Londhe
 * @Date 18-12-2020
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/category")
public class CategoryMasterController {

	@Autowired
	private CategoryMasterService categoryService;

	@PostMapping("/addCategory")
	public List<CategoryMaster> addCategory(@RequestBody CategoryMaster category) {
		categoryService.saveCategory(category);
		List<CategoryMaster> list = (List<CategoryMaster>) categoryService.getAllCategory();
		return list;
		// return "Packing Added Successfully";
	}

	@GetMapping("/getCategory/{categoryId}")
	public CategoryMaster getCategory(@PathVariable int categoryId) {
		return categoryService.getCategory(categoryId);
	}

	@GetMapping("/getAll")
	public List<CategoryMaster> getAllCategory() {
		List<CategoryMaster> list = categoryService.getAllCategory();
		return list;
	}

	@PutMapping("/update")
	public List<CategoryMaster> updateCategory(@RequestBody CategoryMaster category) {
		categoryService.updateCategory(category);
		List<CategoryMaster> list = categoryService.getAllCategory();
		return list;
	}

	@DeleteMapping("/delete/{categoryId}")
	public boolean remove(@PathVariable int categoryId) {
		CategoryMaster category = categoryService.getCategory(categoryId);
		if (category != null) {
			categoryService.deleteCategory(category);
			return true;
		}
		return false;
	}
}
