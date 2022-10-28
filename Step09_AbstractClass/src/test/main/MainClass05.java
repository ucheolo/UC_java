package test.main;

import java.util.Scanner;
import test.mypac.Weapon;

public class MainClass05 {
	//필드를 선언하면서 값 얻어내서 대입하는 코드
	int num = 17;
	String name = "kim";
	Scanner scan = new Scanner(System.in);
	//필드는 선언만 하면 기본값이 들어간다.
	int weight; // 0
	boolean isRun; // false
	String msg; // null
	//static 영역에 올리고 싶은 필드는 static 예약어를 이용해서 만든다.
	static String greet = "안녕";
	
	// Weapon을 상속받은 익명 내부 class로 객체 생성?
	// Anonymous Inner Class를 이용해서 Weapon type의 참조값 얻어내기
	static Weapon w1 = new Weapon() {
		@Override
		public void attack() {
			System.out.println("무엇인지 모르겠지만 공격!");
		}
	};
	
	public static void main(String[] args) {
		useWeapon(w1);
		// Anonymous Local Inner Class를 이용해서 Weapon type의 참조값 얻어내기
		Weapon w2 = new Weapon() {
			@Override
			public void attack() {
				System.out.println("공격 공격!");
			}
		};
		
		useWeapon(w2);
		
		// 한번말 쓰고 말거면? Weapon type id(참조값)을 얻어내??
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("ㄱㄱㄱㄱ");
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
