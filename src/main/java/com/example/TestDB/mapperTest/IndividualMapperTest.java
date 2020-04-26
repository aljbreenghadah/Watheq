package com.example.TestDB.mapperTest;



	import org.junit.Assert;
import org.junit.Test;

import com.example.TestDB.dto.IndividualDTO;
	import com.example.TestDB.mapperImp.IndividualMapperImp;
import com.example.TestDB.model.Individual;



	public class IndividualMapperTest {

		private static final IndividualMapperImp individualMapper = new IndividualMapperImp();


		@Test
		public void IndividualMapper_domainToDto() {
			final IndividualDTO source =new IndividualDTO();

			source.setNationalID("W");
			source.setFirstname("W");
			source.setMName("W");
			source.setLastname("W");
			source.setGender(true);
			source.setStatus("W");
			source.setSkills("W");
			source.setDOB(null);
			source.setMAJOR("W");
			source.setAttachments("W");
			source.setJOP("W");

			final Individual target = individualMapper.dtoToDomain(source);

			Assert.assertNotNull(target);
			Assert.assertEquals("W", target.getNationalID());
			Assert.assertEquals("W", target.getFirstName());
			Assert.assertEquals("W", target.getMName());
			Assert.assertEquals("W", target.getLastName());
			Assert.assertEquals(true, target.getGender());
			Assert.assertEquals("W", target.getStatus());
			Assert.assertEquals("W", target.getSkills());
			Assert.assertEquals(null, target.getDOB());
			Assert.assertEquals("W", target.getMAJOR());
			Assert.assertEquals("W", target.getAttachments());
			Assert.assertEquals("W", target.getJOP());
			




		}


		@Test
		public void IndividualMapper_dtoToDomain() {
			final Individual source =new Individual();

			source.setNationalID("W");
			source.setFirstName("W");
			source.setMName("W");
			source.setLastName("W");
			source.setGender(true);

			source.setStatus("W");
			source.setSkills("W");
			source.setDOB(null);
			source.setMAJOR("W");

			source.setAttachments("W");
			source.setJOP("W");
		

			final IndividualDTO target = individualMapper.domainToDto(source);

			Assert.assertNotNull(target);
			Assert.assertEquals("W", target.getNationalID());
			Assert.assertEquals("W", target.getFirstname());
			Assert.assertEquals("W", target.getMName());
			Assert.assertEquals("W", target.getLastname());
			Assert.assertEquals(true, target.getGender());
			Assert.assertEquals("W", target.getStatus());
			Assert.assertEquals("W", target.getSkills());
			Assert.assertEquals(null, target.getDOB());
			Assert.assertEquals("W", target.getAttachments());  
			

		
		}
		}

	
