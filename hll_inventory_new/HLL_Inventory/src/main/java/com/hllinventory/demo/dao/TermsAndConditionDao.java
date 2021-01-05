package com.hllinventory.demo.dao;

import java.util.List;

import com.hllinventory.demo.model.TermsAndCondition;

public interface TermsAndConditionDao {
	public void saveTermsAndCondition(TermsAndCondition terms);
	public TermsAndCondition getTermsAndCondition(Integer inv_termsandCondition_master_id);
	public List<TermsAndCondition> getAllTermsAndCondition();
	public void updateTermsAndCondition(TermsAndCondition terms);

}
