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
 * @Date 16-12-2020
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pharma_packing_master")
public class PackingMaster {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pack_id")
	private int packId;
	
	@Column(name="pack_type")
	private String packType;
		
	@Column(name="pack_delete_flag")
	private int packDeleteFlag;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="pack_update_date")
	private Date packUpdateDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "pak_add_date")
	private Date pakAddDate;

	@PrePersist
    protected void onCreate() {
		packUpdateDate = pakAddDate = new Date();
    }
	@PreUpdate
    protected void onUpdate() {
		packUpdateDate = new Date();
    }
}
