package com.bionexo.ubsapi.calculation;

import com.bionexo.ubsapi.dto.OriginDTO;
import com.bionexo.ubsapi.model.GeoCode;

public class Haversine {

	
	private static final int NUMBER_THOUSAND = 1000;
	private static final int NUMBER_ONE = 1;
	private static final int NUMBER_TWO = 2;
	private static final long RADIUS_EARTH = 6371 * NUMBER_THOUSAND;

	public static Double calculate(OriginDTO origin, GeoCode destiny) {

		double sourceLatitudeRadians = Math.toRadians(origin.getLatitude());
		double destinyLatitudeRadians = Math.toRadians(destiny.getLatitude());
		
		double diferenceLatitudeRadians = Math.toRadians(origin.getLatitude() - destiny.getLatitude());
		double diferenceLongitudeRadians = Math.toRadians(origin.getLongitude() - destiny.getLongitude());
		
		
		double formulaPartOne = Math.sin(diferenceLatitudeRadians/NUMBER_TWO) * Math.sin(diferenceLatitudeRadians/NUMBER_TWO) + 
				   Math.cos(sourceLatitudeRadians) * Math.cos(destinyLatitudeRadians) *
				   Math.sin(diferenceLongitudeRadians/NUMBER_TWO) * Math.sin(diferenceLongitudeRadians/NUMBER_TWO);
		
		double formulaPartTwo = NUMBER_TWO * Math.atan2(Math.sqrt(formulaPartOne), Math.sqrt(NUMBER_ONE - formulaPartOne));
		
		double result = RADIUS_EARTH * formulaPartTwo;
		
		return result / NUMBER_THOUSAND;
		
	}
	
	public static void main (String args[]) {
//		5.559968619378912
		OriginDTO origin = new OriginDTO();
		origin.setLatitude(50.12);
		origin.setLongitude(50.15);
		
		GeoCode destiny = new GeoCode();
		destiny.setLatitude(50.18);
		destiny.setLongitude(50.20);
		System.out.println(Haversine.calculate(origin,destiny));
	}
}
