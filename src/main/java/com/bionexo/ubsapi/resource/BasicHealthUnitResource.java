package com.bionexo.ubsapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bionexo.ubsapi.dto.BasicHealthUnitDTO;
import com.bionexo.ubsapi.service.BasicHealthUnitService;

@RestController
@RequestMapping("/basicHealthUnit")
public class BasicHealthUnitResource {
	
	@Autowired
	private BasicHealthUnitService basicHealthUnitService;
	
	@GetMapping
	public List<BasicHealthUnitDTO> listAll() {
		return basicHealthUnitService.listAll();
	}
}
