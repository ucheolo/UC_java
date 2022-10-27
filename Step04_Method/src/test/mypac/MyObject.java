package test.mypac;

public class MyObject {
	public void walk() {
		System.out.println("걸음을 걸어요");
	}
	public int getNumber() {
		return 10;
	}
	public String getGreeting() {
		return "안녕하세요";
	}
	
	//car type을 리턴해주는 메소드
	public Car getCar() {
		return new Car();
	}
	// int type 을 메소드의 인자로 전달 받는 메소드
	public void setNum(int num) {
		System.out.println("num:"+num);
	}
	//String type을 메소드의 인자로 전달 받는 메소드
	public void setName(String name) {
		System.out.println("name:"+name);
	}
	// Car type 을 메소드의 인자로 전달받는 메소드
	public void useCar(Car car) {
		car.drive();
	}
	// 3개의 type을 메소드의 인자로 전달 받는 메소드
	public void doSomething(int num, String msg, Car c) {
		System.out.println("무언가를 작업합니다.");
	}
}
