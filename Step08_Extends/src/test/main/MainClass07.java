package test.main;

import test.auto.ElectricCar;
import test.auto.Engine;
import test.auto.TurtleCar;

public class MainClass07 {
	public static void main(String[] args) {
		//생성자의 인자로 Engine객체를 전달하면서 ElectricCar
		ElectricCar car1 = new ElectricCar(new Engine());
		car1.drive();
		car1.charge();
		
		TurtleCar car2 = new TurtleCar(new Engine());
		car2.drive();
		car2.charge();
	}
}
