package test.main;
/*
 *  2. 증감 연산자 테스트
 *     변수에 있는 숫자 값을 1씩 증가 혹은 1씩 감소 시킬때 사용
 *  ++, --
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num = 0;
		num++;
		num++;
		num++; // num이 최종적으로 3이 된다.
		
		int num2 = 0;
		num2--;
		num2--;
		num2--; // num2가 최종적으로 -3이 된다.
		
		int num3 = 0;
		int result1 = num3++; // result1에 0이 대입되고 num3이 1 증가
		
		int num4 = 0;
		int result2 = ++num4; // num4가 1 증가하고 result2네 1이 대입
	}
}
