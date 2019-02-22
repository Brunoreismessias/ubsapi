package com.bionexo.ubsapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bionexo.ubsapi.dto.TypeStreetDTO;
import com.bionexo.ubsapi.service.TypeStreetService;

@RestController
@RequestMapping("/typeStreet")
public class TypeStreetResource {
	
	@Autowired
	private TypeStreetService typeStreetService;
	
	@GetMapping
	public List<TypeStreetDTO> listAll() {
		return typeStreetService.listAll();
	}
}
