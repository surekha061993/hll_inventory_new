package com.hllinventory.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

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
public class DocumentNumberingMaster implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "document_numbering_id")
	private int docNumId;

	@Column(name = "document_series")
	private String docSeries;

	@Column(name = "document_number")
	private Integer docNo;

	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "docid")
	private DocumentMaster document;

	@Column(name = "document_prefix")
	private String docPrefix;

	@Column(name = "document_suffix")
	private String docSuffix;

//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name = "year_id")
	@OneToMany
	private List<FinancialYearMaster> year_id;

	@Column(name = "doc_delete_flag")
	private int docDeleteFlag;

	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "doc_update_date")
	private Date docUpdateDate;
	
	@PrePersist
    protected void onUpdate() {
		docUpdateDate = new Date();
    }
	
	}
