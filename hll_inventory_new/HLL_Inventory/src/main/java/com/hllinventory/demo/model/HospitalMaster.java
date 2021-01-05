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
 * @Date 29-12-2020
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="inv_hospital_details")
public class HospitalMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	  private Integer idinv_hospital_details; 
	  private String inv_hospital_address;
	  private String inv_hospital_name;
	  private String inv_hospital_district;
	  private String inv_hospital_taluka;
	  private String inv_hospital_state;
	  private String inv_hospital_country;
	  private String inv_hospital_pincode;
	  
	  @Temporal(TemporalType.TIMESTAMP)
	  private Date inv_hospital_created_date;
	  
	  @Temporal(TemporalType.TIMESTAMP)
	  private Date inv_hospital_update_date;
	  @Column(name="inv_hospital_delete_flag")
	  private int invHospitalDeleteFlag;
	  private String inv_hospital_deleted_by_name;
	  private int inv_hospital_deleted_by_id;
//	  private String temsAndCondStatus;
//	  
//	  private String termsAndCondition;
	  @PrePersist
	    protected void onCreate() {
		  inv_hospital_update_date = inv_hospital_created_date = new Date();
	    }
		@PreUpdate
	    protected void onUpdate() {
			inv_hospital_update_date = new Date();
	    }
}
