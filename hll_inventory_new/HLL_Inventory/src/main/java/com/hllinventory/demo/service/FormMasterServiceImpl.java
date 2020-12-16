package com.hllinventory.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hllinventory.demo.dao.FormMasterDao;
import com.hllinventory.demo.model.FormMaster;

/**
 * @author Surekha Londhe
 * @Date 16-12-2020
 */

@Service
public class FormMasterServiceImpl implements FormMasterService {

	@Autowired
	private FormMasterDao formDao;
	
	@Override
	public void saveForm(FormMaster form) {
		formDao.saveForm(form);
	}
	
	@Override
	public List<FormMaster> getAllForm() {
		List<FormMaster> form=formDao.getAllForm();
		return form;
	}

	@Override
	public void update(FormMaster form) {
		 formDao.update(form);
	}
	@Override
	public FormMaster remove(FormMaster form) {
		form.setFormDeleteFlag(1);
		formDao.update(form);
		return form;
	}

	@Override
	public FormMaster getFormMaster(int formId) {
		return formDao.getFormMaster(formId);
	}

}
