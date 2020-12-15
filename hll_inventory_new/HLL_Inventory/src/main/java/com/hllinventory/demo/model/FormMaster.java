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

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="pharma_form_master")
public class FormMaster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="form_id")
	private Integer formId;
	
	@Column(name="form_name")
	private String formName;
	
	@Column(name="form_delete_flag")
	private int formDeleteFlag;
	
//	@Temporal(TemporalType.DATE)
//	@Column(name="form_update_date")
//	private Date formUpdateDate;
//
//	@Temporal(TemporalType.DATE)
//	@Column(name = "form_add_date")
//	private Date formAddDate;
//	
//	@PrePersist
//    protected void onCreate() {
//		formUpdateDate = formAddDate = new Date();
//    }
//	@PreUpdate
//    protected void onUpdate() {
//		formUpdateDate = new Date();
//    }

}
