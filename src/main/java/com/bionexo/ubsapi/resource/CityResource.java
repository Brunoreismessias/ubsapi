package com.bionexo.ubsapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bionexo.ubsapi.dto.CityDTO;
import com.bionexo.ubsapi.service.CityService;

@RestController
@RequestMapping("/city")
public class CityResource {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping
	public List<CityDTO> listAll() {
		return cityService.listAll();
	}
}
