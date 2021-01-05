package com.hllinventory.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "inv_warehouse_master")
public class WarehouseMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "warehouse_id")
	private Integer warehouseId;
	
	@Column(name = "warehouse_name")
	private String warehouseName;
	
	@Column(name = "warehouse_location")
	private String warehouselocation;
	
	@Column(name = "warehouse_contactno")
	private String warehousecontactNo;
	
	@Column(name = "warehouse_state")
	private String warehousestate;
	
	@Column(name = "warehouse_delete_flag")
	private int warehouse_delete_flag;
	
	@Column(name = "warehouse_update_date")
	private Date warehouse_update_date;
	
	private Integer inv_warehouse_master_not_applicable_for_maintanace;
	
	private Integer inv_warehouse_master_applicable_for_maintanace;

}
