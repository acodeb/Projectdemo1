package com.model;

import com.factory.Car;
import com.factory.CarType;

public class SUV extends Car{

	public SUV(){
		super(CarType.SUV);
		construct();
	}
	
	public void construct(){
		System.out.println("Build a SUV");
	}
}

