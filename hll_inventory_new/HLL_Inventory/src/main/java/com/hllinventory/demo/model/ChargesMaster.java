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
 * @Date 20-12-2020
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="inv_charges_master")
@Entity
public class ChargesMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int inv_charges_Id;
	private String inv_charges_name;
	@Column(name="inv_status")
	private String status;
	@Temporal(TemporalType.TIMESTAMP)
	private Date inv_charges_create_date;
	@Temporal(TemporalType.TIMESTAMP)
	private Date inv_charges_update_date;
	
	@PrePersist
    protected void onCreate() {
		inv_charges_update_date = inv_charges_create_date = new Date();
    }
	@PreUpdate
    protected void onUpdate() {
		inv_charges_update_date = new Date();
    }
}
