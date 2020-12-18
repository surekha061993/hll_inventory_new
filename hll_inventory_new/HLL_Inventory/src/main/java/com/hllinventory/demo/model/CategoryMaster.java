package com.hllinventory.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="inv_category_master")
public class CategoryMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="category_Id")
	private int categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	@Column(name="status")
	private String categoryStatus;
	
	@Column(name="inv_category_perfix_cat_name")
	private String categoryPerifix;
	
	@Column(name="inv_category_create_date")
	private Date categoryCreateDate;
	
	@Column(name="inv_category_update_date")
	private Date categoryUpdateDate;
	
	@PrePersist
    protected void onCreate() {
		categoryUpdateDate = categoryCreateDate = new Date();
    }
	@PreUpdate
    protected void onUpdate() {
		categoryUpdateDate = new Date();
    }
}
