package test.main;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		int point = 1000;
		int count = 1;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			//만일 point가 0이면
			if(point == 0) {
				break; // 반복문 loop 탈출
			}
			System.out.println("Enter를 치세요!");
			scan.nextLine();
			
			//point 를 10 감소
			point -= 10;
			System.out.println("수행중 "+count+"번째");
			
			count = count + 1;
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
