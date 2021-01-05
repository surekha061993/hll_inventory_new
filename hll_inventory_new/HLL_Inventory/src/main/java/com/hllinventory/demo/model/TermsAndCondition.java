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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="inv_termsandcondition_master")

public class TermsAndCondition {
	
		  @Id
		  @GeneratedValue(strategy=GenerationType.IDENTITY)
		  private int inv_termsandCondition_master_id;  
		  
		  @Column(name="inv_termsandCondition_master_details")
		  private String termsAndCondition;
		  private int inv_termsandCondition_master_deleted_by_id;
		  private String inv_termsandCondition_master_deleted_by_name;
		  @Column(name="inv_termsandCondition_master_delete_flag")
		  private int termsandConditionMasterDeleteFlag;
		  
		  private Date inv_termsandCondition_master_deleted_date;
		  @Temporal(TemporalType.TIMESTAMP)
		  @Column(name="inv_termsandCondition_master_create_date")
		  private Date Create_date;
		  
		  @Temporal(TemporalType.TIMESTAMP)
		  @Column(name="inv_termsandCondition_master_update_date")
		  private Date Update_date;
		  
		  private String inv_name;
		  @Column(name="inv_termsandCondition_status")
		  private String temsAndCondStatus;	
		  @PrePersist
		    protected void onCreate() {
			  Update_date = Create_date = new Date();
		    }
			
			@PreUpdate
		    protected void onUpdate() {
				Update_date = new Date();
		    }
}
