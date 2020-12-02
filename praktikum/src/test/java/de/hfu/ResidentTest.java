package de.hfu;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.MatcherAssert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.hamcrest.Matchers.equalTo;
import static org.easymock.EasyMock.*;
import org.junit.Test;
import org.junit.runner.FilterFactory.FilterNotCreatedException;

public class ResidentTest {

	@Test
	public void test() throws ResidentServiceException{
		
		Resident resident1 = new Resident("Test", "Nachname", "Strasse", "Furtwangen", new Date(2020,10,10));
		Resident resident2 = new Resident("Max", "Name", "Test", "Furtwangen", new Date(2020,10,10));
		Resident resident3 = new Resident("Hans", "Peter", "Test", "Furtwangen", new java.util.Date(2020,10,10));
 
	    List<Resident> residentList1 = new ArrayList<>();
		residentList1.add(resident1);
		residentList1.add(resident2);
		residentList1.add(resident3);
 
 
		ResidentRepository mockObject = createMock(ResidentRepository.class);
		expect(mockObject.getResidents()).andReturn(residentList1);
 
		replay(mockObject);
 
		BaseResidentService residentService = new BaseResidentService();
		residentService.setResidentRepository(mockObject);
 
 
		int size = residentService.getFilteredResidentsList(resident2).size();
 
		verify(mockObject);
 
		assertTrue(size == 1);
		
		
		//Erstellung stub
		ResidentRepositoryStub stubObject = new ResidentRepositoryStub();
		
		//BaseResidentService residentService = new BaseResidentService();
		//residentService.setResidentRepository(stubObject);
		
		
		//Stubtest
		
		//assertEquals(resident1.getFamilyName(),residentService.getUniqueResident(resident1).getFamilyName());
		//assertEquals(resident2.getGivenName(),residentService.getUniqueResident(resident2).getGivenName());
		//assertFalse(resident2.getGivenName() == residentService.getUniqueResident(resident1).getGivenName());
		//assertTrue(1 == residentService.getFilteredResidentsList(resident1).size());
		//assertFalse(4 == residentService.getFilteredResidentsList(resident1).size());
		//assertTrue(residentService.getFilteredResidentsList(resident1).contains());
	}

}
