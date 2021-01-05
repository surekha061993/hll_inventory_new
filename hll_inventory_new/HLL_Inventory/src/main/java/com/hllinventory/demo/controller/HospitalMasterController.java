package com.hllinventory.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hllinventory.demo.model.HospitalMaster;
import com.hllinventory.demo.service.HospitalMasterService;
/**
 * @author Surekha Londhe
 * @Date 29-12-2020
 */
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/hospital")
@RestController
public class HospitalMasterController {

	@Autowired
	private HospitalMasterService hospitalService;

	@PostMapping("/addHospital")
	public List<HospitalMaster> addHospital(@RequestBody HospitalMaster hospital) {
		hospitalService.saveHospital(hospital);
		List<HospitalMaster> list = (List<HospitalMaster>) hospitalService.getAllHospital();
		return list;
	}

	@GetMapping("/getHospital/{idinv_hospital_details}")
	public HospitalMaster getHospital(@PathVariable int idinv_hospital_details) {
		return hospitalService.getHospital(idinv_hospital_details);
	}

	@GetMapping("/getAll")
	public List<HospitalMaster> getAllHospital() {
		List<HospitalMaster> hospital = hospitalService.getAllHospital();
		return hospital;
	}

	@PutMapping("/update")
	public List<HospitalMaster> updateHospital(@RequestBody HospitalMaster hospital) {
		hospitalService.updateHospital(hospital);
		List<HospitalMaster> list = hospitalService.getAllHospital();
		return list;
	}

	@DeleteMapping("/delete/{idinv_hospital_details}")
	public boolean remove(@PathVariable int idinv_hospital_details) {
		HospitalMaster hospital = hospitalService.getHospital(idinv_hospital_details);
		if (hospital != null) {
			hospitalService.deleteHospital(hospital);
			return true;
		}
		return false;
	}
}
