package test.com.model;

import com.factory.CarFactory;
import com.factory.CarType;
import com.factory.Car;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory.createCar(CarType.HATCHBACK);
		CarFactory.createCar(CarType.SEDAN);
		CarFactory.createCar(CarType.SUV);
	}

}
