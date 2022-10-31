package test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		//정수를 저장할수 있는 ArrayList객체를 생성해서
		//참조값을 List 인터페이스 type의 지역변수 nums에 담기
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		for(Integer tmp:nums) {
			System.out.println(tmp);
		}
		System.out.println("-----");
		nums.forEach((item)->{
			System.out.println(item);
		});
	}
}
