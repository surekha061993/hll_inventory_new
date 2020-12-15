package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.DocumentMasterRepository;
import com.hllinventory.demo.dao.FormMasterDao;
import com.hllinventory.demo.model.FormMaster;

@Service
public class FormMasterServiceImpl implements FormMasterService {

	@Autowired
	private FormMasterDao formDao;
	
	@Autowired
	private DocumentMasterRepository documentRepository;
	
	@Override
	public void saveForm(FormMaster form) {
		formDao.saveForm(form);
	}

	@Override
	public int deleteForm(int formId) {
		//form.setDocDeleteFlag(1);
		formDao.deleteForms(formId);
		return formId;
	}

	@Override
	public List<FormMaster> getAllForm() {
		List<FormMaster> form=formDao.getAllForm();
		return form;
	}

}
