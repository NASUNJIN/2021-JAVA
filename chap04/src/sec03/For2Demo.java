package sec03;

public class For2Demo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 4주차
	 * 설명 : 반복문(for) 예제
	 * @author 나선진
	 *
	 */
	public static void main(String[] args) {
		for(int row = 2; row <10; row++) {
			for(int column =1; column <10; column++) {
				System.out.printf("%4d",row*column);
			}
			System.out.println();
		}

	}

}
