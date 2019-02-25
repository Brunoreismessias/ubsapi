package com.bionexo.ubsapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bionexo.ubsapi.dto.BasicHealthUnitDTO;
import com.bionexo.ubsapi.service.BasicHealthUnitService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/basicHealthUnit")
public class BasicHealthUnitResource {
	
	@Autowired
	private BasicHealthUnitService basicHealthUnitService;
	
	@ApiOperation(value="Returns a list with all ubs", response=BasicHealthUnitDTO.class)
	@GetMapping
	public List<BasicHealthUnitDTO> listAll() {
		return basicHealthUnitService.listAll();
	}
	
	
	@ApiOperation(value="Query Ubs Near a particular location", response=BasicHealthUnitDTO.class)
	@ApiResponses(value= { 
			@ApiResponse(code=200, message="Returns a BasicHealthUnitDTO list with the nearest UBS of the reported location", response=BasicHealthUnitDTO.class),
	})
	
	@GetMapping("/findUnitNear/{latitude}/{longitude}/{distance}")
	public List<BasicHealthUnitDTO> finUnitNear(@PathVariable Double latitude, @PathVariable Double longitude, @PathVariable Double distance) {
		return basicHealthUnitService.findUnitNear(latitude, longitude, distance);
	}
	
}
