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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 * @author Surekha Londhe
 * @Date 28-12-2020
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="inv_subinventory_master")
@Entity
public class LabStoreMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer subinventory_Id;
	private String subinventory_name;
	private String subinventory_location;
	private String inv_subInventory_contact_no;
	@Column(name="avialable_qty")
	private int avialableQty;
	@Column(name="status")
	private String subInventorystatus;
	private String state;
	@Column(name="inv_substore_contactperson")
	private String contactPerName;
	@Column(name="la_qty")
	private int labQty;
	@Column(name="inv_substore_address")
	private String subStoreAddress;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date inv_subinventory_master_update_date;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date inv_subinventory_master_create_date;
	
	@PrePersist
    protected void onCreate() {
		inv_subinventory_master_update_date = inv_subinventory_master_create_date = new Date();
    }
	@PreUpdate
    protected void onUpdate() {
		inv_subinventory_master_update_date = new Date();
    }
}
