package sec03;

public class While2Demo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 4주차
	 * 설명 : while문 구구단 예제
	 * @author 나선진
	 *
	 */
	public static void main(String[] args) {
		int row=2;
		while (row<10){
			int column = 1;
			while (column<10) {
				System.out.printf("%4d", row*column);
				column++;
			}
			System.out.println();
			row++;
		}

	}

}
