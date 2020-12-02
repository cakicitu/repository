package de.hfu;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class ResidentRepositoryStub implements ResidentRepository{
	

	
	@Override
	public List<Resident> getResidents() {
		
		@SuppressWarnings("deprecation")
		Resident resident1 = new Resident("Test","Nachname","test","test", new Date(2020,10,10));
		Resident resident2 = new Resident("Max","Must","test2","Woanders", new Date(2020,7,10));
		Resident resident3 = new Resident("Tom","Jerry","test3","Furtwangen", new Date(2020,6,10));
		


		

		List<Resident> residentList = new ArrayList<>();
		residentList.add(resident1);
		residentList.add(resident2);
		residentList.add(resident3);
		
		
		
		return residentList;
	}
	
	

}
