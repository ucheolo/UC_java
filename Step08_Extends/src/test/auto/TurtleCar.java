package test.auto;

public class TurtleCar extends Car{

	public TurtleCar(Engine engine) {
		super(engine);
	}
	
	@Override
	public void drive() {
		// TODO Auto-generated method stub
		super.drive();
		System.out.println("너무 느려요");
	}
	
	public void charge() {
		System.out.println("주유하세요");
	}

}
