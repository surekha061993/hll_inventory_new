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

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Surekha Londhe
 * @Date 17-12-2020
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pharma_financial_year_master")
public class FinancialYearMaster {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "year_id")
	private int yearId;

	@Column(name = "year_start_date")
	@Temporal(TemporalType.DATE)
	private Date yearStartDate;

	@Column(name = "year_end_date")
	@Temporal(TemporalType.DATE)
	private Date yearEndDate;

	@Column(name = "year")
	private String yearFinancial;

	@Column(name = "year_delete_flag")
	private int yearDeleteFlag;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "year_update_date")
	private Date yearUpdateDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "year_add_date")
	private Date yearAddDate;
	
	@PrePersist
    protected void onCreate() {
		yearUpdateDate = yearAddDate = new Date();
    }
	@PreUpdate
    protected void onUpdate() {
		yearUpdateDate = new Date();
    }
}

