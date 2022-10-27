package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		
		//자식에게 사준 일발 핸드폰(인터넷이 안됌)
		HandPhone p1 = new HandPhone();
		
		//SmartPhone 갖고싶다!
		SmartPhone p2 = (SmartPhone)p1;
		
		//인터넷 가능
		p2.doInternet();
	}
}
