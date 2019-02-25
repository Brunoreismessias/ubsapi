package com.bionexo.ubsapi.integration;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bionexo.ubsapi.model.BasicHealthUnit;
import com.bionexo.ubsapi.repository.BasicHealthUnitRepository;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class BasicHealthUnitRepositoryIntegrationTest {

	@Autowired
	private BasicHealthUnitRepository basicHealthUnitRepository;
	
	@Test
	public void listAllBasicHealthUnit() {
		List<BasicHealthUnit> list = basicHealthUnitRepository.findAll();
		assertThat(list).isNotEmpty();
	}
}
