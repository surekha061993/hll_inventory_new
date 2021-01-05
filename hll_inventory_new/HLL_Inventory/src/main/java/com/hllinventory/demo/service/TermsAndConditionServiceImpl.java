package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.TermsAndConditionDao;
import com.hllinventory.demo.model.TermsAndCondition;
@Service
public class TermsAndConditionServiceImpl implements TermsAndConditionService {

	@Autowired
	private TermsAndConditionDao termsDao;
	
	@Override
	public void saveTermsAndCondition(TermsAndCondition terms) {
		termsDao.saveTermsAndCondition(terms);
	}

	@Override
	public TermsAndCondition getTermsAndCondition(int inv_termsandCondition_master_id) {
		
		return termsDao.getTermsAndCondition(inv_termsandCondition_master_id);
	}

	@Override
	public List<TermsAndCondition> getAllTermsAndCondition() {
		List<TermsAndCondition> list=termsDao.getAllTermsAndCondition();
		return list;
	}

	@Override
	public void updateTermsAndCondition(TermsAndCondition terms) {
		termsDao.updateTermsAndCondition(terms);
	}

	@Override
	public TermsAndCondition deleteTermsAndCondition(TermsAndCondition terms) {
		terms.setTermsandConditionMasterDeleteFlag(1);
		termsDao.updateTermsAndCondition(terms);
		return terms;
	}
}
