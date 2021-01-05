package com.hllinventory.demo.service;

import java.util.List;

import com.hllinventory.demo.model.TermsAndCondition;

public interface TermsAndConditionService {
	public void saveTermsAndCondition(TermsAndCondition terms);

	public TermsAndCondition getTermsAndCondition(int TermsAndCondition_id);

	public List<TermsAndCondition> getAllTermsAndCondition();

	public void updateTermsAndCondition(TermsAndCondition terms);

	public TermsAndCondition deleteTermsAndCondition(TermsAndCondition terms);

}
