package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		// 1. Car type을 저장할수 있는 ArrayList객체를 생성해서
		// 참조값을 List 인터페이스 type 지역변수 cars에 담아보세요.
		List<Car> cars = new ArrayList<>();
		// 2. Car 객체(3개)를 생성해서 List 객체에 저장해 보세요.
		cars.add(new Car("모닝"));
		cars.add(new Car("아반뗴"));
		cars.add(new Car("지바겐"));
		// 3. 반복문 for문을 이용해서 List객체에 저장된 모든 Car객체의 drive() 메소드를
		// 순서대로 호출해 보세요.
		for(Car c:cars) {
			c.drive();
		}
		System.out.println("----- Consumer 인터페이스 활용 -----");
		cars.forEach((item)->{
			item.drive();
		});
	}
}
