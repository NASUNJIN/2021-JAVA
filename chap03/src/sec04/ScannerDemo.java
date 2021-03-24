package sec04;

import java.util.Scanner;

public class ScannerDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 3주차
	 * 설명 : 연산자 예제
	 * @author 나선진
	 *
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d입니다.\n",x,y,x*y);

	}

}
