package sec02;
import java.util.Scanner;
public class SimplefDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 4주차
	 * 설명 : 조건문 예제
	 * @author 나선진
	 *
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int number = in.nextInt();
		
		if(number %2==0)
			System.out.println("짝수!");
		if(number%2==1)
			System.out.println("홀수!");
		System.out.println("종료");
	}

}
