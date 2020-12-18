package com.hllinventory.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="pharma_document_numbering_master")
@Entity
public class DocumentNumberingMaster {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "doc_num_id")
	private int docNumId;

	@Column(name = "doc_series")
	private String docSeries;

	@Column(name = "doc_no")
	private Integer docNo;

	@OneToOne
	@JoinColumn(name = "doc_id")
	private DocumentMaster documentMaster;

	@Column(name = "doc_prefix")
	private String docPrefix;

	@Column(name = "doc_suffix")
	private String docSuffix;

	@ManyToOne
	@JoinColumn(name = "doc_fin_year_id")
	private FinancialYearMaster yearMaster;

	@Column(name = "doc_delete_flag")
	private Integer docDeleteFlag;

	@Column(name = "doc_update_date")
	private Date docUpdateDate;

	}
