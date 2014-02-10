package com.model;

import com.factory.Car;
import com.factory.CarType;

public class Sedan extends Car{

	public Sedan(){
		super(CarType.SEDAN);
		construct();
	}
	
	public void construct(){
		System.out.println("Build a Sedan");
	}
}

