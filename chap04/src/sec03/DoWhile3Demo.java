package sec03;

public class DoWhile3Demo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 4주차
	 * 설명 : 반복문(Do ~ While) 구구단 예제
	 * @author 나선진
	 *
	 */
	public static void main(String[] args) {
		int row = 2;
		do {
			int column = 1;
			do {
				System.out.printf("%4d",row*column);
				column++;
			}while(column<10);
			System.out.println();
			row++;
		}while(row<10);

	}

}
