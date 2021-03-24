package sec05;

public class CompLocDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 4주차
	 * 설명 : 연산자 예제
	 * @author 나나선진
	 *
	 */
	public static void main(String[] args) {
		int x=0, y=1;
		System.out.println((x<1)||(y--<1));
		System.out.println("x = "+x+" y = "+y);
		
		x=0;
		y=1;
		System.out.println((x<1)|(y--<1));
		System.out.println("x = "+x+" y = "+y);

	}

}
