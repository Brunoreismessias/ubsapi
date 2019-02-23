package com.bionexo.ubsapi.calculation.haversine;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bionexo.ubsapi.calculation.Haversine;
import com.bionexo.ubsapi.dto.OriginDTO;
import com.bionexo.ubsapi.model.BasicHealthUnit;
import com.bionexo.ubsapi.model.GeoCode;
import com.bionexo.ubsapi.repository.BasicHealthUnitRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class HaversineTest {

	@Autowired
	private BasicHealthUnitRepository basicHealthUnitRepository;
	
	@Test
	public void distanceCalculation() {
		OriginDTO origin = new OriginDTO();
		origin.setLatitude(50.12);
		origin.setLongitude(50.15);

		GeoCode destiny = new GeoCode();
		destiny.setLatitude(50.18);
		destiny.setLongitude(50.20);

		assertThat(Haversine.calculate(origin, destiny)).isEqualTo(7.563296058487345);
	}
	
	
	
	@Test
	public void listAllBasicHealthUnit() {
		
		OriginDTO origin = new OriginDTO();
		origin.setLatitude(50.12);
		origin.setLongitude(50.15);
		origin.setDistance(8.0);
		
		
		List<BasicHealthUnit> list = new ArrayList<>();
		
		for(BasicHealthUnit basicHealthUnit : basicHealthUnitRepository.findAll()) {
			if (Haversine.calculate(origin, basicHealthUnit.getGeoCode()) <= origin.getDistance()) {
				list.add(basicHealthUnit);
			}
		}
		
		assertThat(list).isNotEmpty();
	}
}
