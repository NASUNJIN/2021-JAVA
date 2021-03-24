package sec05;

public class TernaryOperatorDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 4주차
	 * 설명 : 조건연산자 예제
	 * @author 나선진
	 *
	 */
	public static void main(String[] args) {
		int x = 1;
		int y;
		y =(x==1)?10:20;
		System.out.println(y);
		y=(x>1)?x++:x+20;
		System.out.println(x);
		System.out.println(y);

	}

}
