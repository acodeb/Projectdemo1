package com.model;

import com.factory.Car;
import com.factory.CarType;

public class HatchBack extends Car{

	public HatchBack(){
		super(CarType.HATCHBACK);
		construct();
	}
	
	public void construct(){
		System.out.println("Build a HatchBack");
	}
}

