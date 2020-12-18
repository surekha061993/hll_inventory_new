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

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="inv_manufacturer_master")

public class ManufacturerMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="manufacturer_Id")
	private int manufacturerId;
	
	@Column(name="manufacturer_name")
	private String manufacturerName;
	
	@Column(name="manufacturer_detail")
	private String manufacturerDetail;
	
	@Column(name="status")
	private String manufacturerStatus;
	
	@Temporal(TemporalType.DATE)
	@Column(name="inv_manufacturer_master_create_date")
	private Date manufactureCreateDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="inv_manufacturer_master_update_date")
	private Date manufactureUpdateDate;
	
	@PrePersist
    protected void onCreate() {
		manufactureUpdateDate = manufactureCreateDate = new Date();
    }
	@PreUpdate
    protected void onUpdate() {
		manufactureUpdateDate = new Date();
    }
	//private List<ManufacturerMaster> manufacturerMaster;
	
	
}
