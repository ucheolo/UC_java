package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		String[] items = {"cheryy", "apple", "banana", "melon", "7"};

		Random ran = new Random();
		
		int count = 0;
		
		for(int i=0; i<ran.nextInt(700); i++) {
			String rand1 = items[ran.nextInt(5)];
			String rand2 = items[ran.nextInt(5)];
			String rand3 = items[ran.nextInt(5)];
			System.out.println(rand1+" | "+rand2+" | "+rand3);
			if(rand1.equals(rand2)&&rand1.equals(rand3)) {
				count += 1;
				System.out.println("잭팟");
			}
		}
		System.out.println(count);
	}
}
