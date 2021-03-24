package sec05;

public class OperatorPrecedenceDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 4주차
	 * 설명 : 연산자 우선순위 예제
	 * @author 나선진
	 *
	 */
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = ++x * y--;
		System.out.printf("%d\t%d\t%d\n",x,y,z);
		
		int year = 2020;
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

	}

}
