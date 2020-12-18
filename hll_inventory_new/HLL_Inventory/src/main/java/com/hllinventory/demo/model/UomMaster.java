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
@Table(name="inv_uom_master")
public class UomMaster {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uomid;
	private String uomname;
	
	@Column(name="uom_delete_flag")
	private  int uomDeleteFlag;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="uom_update_date")
	private Date uomUpdateDate;
    
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "uom_created_date")
	private Date uomAddDate;
	
	@PrePersist
    protected void onCreate() {
		uomUpdateDate = uomAddDate = new Date();
    }
	@PreUpdate
    protected void onUpdate() {
		uomUpdateDate = new Date();
    }
}
