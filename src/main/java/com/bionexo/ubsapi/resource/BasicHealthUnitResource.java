package com.bionexo.ubsapi.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bionexo.ubsapi.dto.BasicHealthUnitDTO;
import com.bionexo.ubsapi.dto.OriginDTO;
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
	
	@GetMapping("/findUnitNear")
	public List<BasicHealthUnitDTO> finUnitNear(@RequestBody OriginDTO origin, HttpServletResponse response) {
		return basicHealthUnitService.findUnitNear(origin);
	}

	
}
