package com.hllinventory.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Table(name="inv_taxsetup_master")
@Entity
public class TaxMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer tax_id;
	private String tax_code;
	private String tax_description;
	private Double tax_rate;
	private int tax_delete_flag;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date tax_update_date;
	@PrePersist
    protected void onCreate() {
		tax_update_date = new Date();
    }
	
	@PreUpdate
    protected void onUpdate() {
		tax_update_date = new Date();
    }
	
}
