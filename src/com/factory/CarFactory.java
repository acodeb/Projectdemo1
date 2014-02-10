package com.factory;

import com.model.*;

public class CarFactory {

	public static Car createCar(CarType model){
		Car car = null;
		
		switch (model){
			case HATCHBACK : 
				car = new HatchBack();
				break;
			
			case SEDAN :
				car = new Sedan();
				break;
				
			case SUV :
				car = new SUV();
				break;
				
			default : 
				//throw some Exception
				break;
		
		}
		return car;
	}
}
