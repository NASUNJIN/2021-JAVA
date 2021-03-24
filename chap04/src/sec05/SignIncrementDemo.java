package sec05;

public class SignIncrementDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 4주차
	 * 설명 : 부호, 증감연산자 예제
	 * @author 나선진
	 *
	 */
	public static void main(String[] args) {
		int plusOne = 1;
		int minusOne = -plusOne;
		System.out.println("plusOne은 "+plusOne + "입니다.");
		System.out.println("minusOne은 "+minusOne + "입니다.");
		
		int x =1,y=1;
		System.out.println("x = "+x+", ++x= "+ ++x);
		System.out.println("y = "+y+", y++ = "+y++);
		System.out.println("x = "+x+", y = "+y);
	}

}
