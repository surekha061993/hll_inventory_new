package com.hllinventory.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

public class ProductMaster {
	@Id
	@GeneratedValue
	@Column(name = "product_id")
	private Integer productId;

	
	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_short_name")
	private String productShortName;
/*
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_comp_id")
	private CompanyMaster companyMaster;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_pack_id")
	private PackingMaster packingMaster;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_cat_id")
	private CategoryMaster categoryMaster;

	@OneToMany(mappedBy="productMaster")
	@LazyCollection(value=LazyCollectionOption.FALSE)
	private List<BatchMaster> batchMaster = new ArrayList<BatchMaster>();
	
	@OneToMany(mappedBy="stockProductMaster")
	@LazyCollection(value=LazyCollectionOption.FALSE)
	
	private List<StockMaster> stockMasters = new ArrayList<StockMaster>();
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_uom_id")
	private UomMaster uomMaster;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_preparation_id")
	private PreparationMaster preparationMaster;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_strength_id")
	private StrengthMaster strengthMaster;
*/	
	
}
