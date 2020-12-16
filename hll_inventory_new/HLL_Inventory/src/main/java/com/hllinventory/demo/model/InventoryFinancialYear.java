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
@Table(name="inv_financial_year")
public class InventoryFinancialYear {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="fin_year_id")
    private int finYearId;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fin_year_start_date")
	private Date finYearStartDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fin_year_end_date")
	private Date finYearEndDate;
	
	@Column(name="fin_year")
	private String finYear;
	
	@Column(name="fin_delete_flag")
	private int finDeleteFlag;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fin_update_date")
	private Date finUpdateDate;
	
	@PrePersist
    protected void onCreate() {
		finUpdateDate = finYearStartDate = new Date();
    }
	@PreUpdate
    protected void onUpdate() {
		finUpdateDate = new Date();
    }

}
