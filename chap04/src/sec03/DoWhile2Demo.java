package sec03;

public class DoWhile2Demo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 4주차
	 * 설명 : 반복문(Do ~ While) 예제
	 * @author 나선진
	 *
	 */
	public static void main(String[] args) {
		int i = 10;
		do {
			i++;
		}while(i<5);
		System.out.println("do~while문 실행 후 : "+i);
		
		i =10;
		while(i<5) {
			i++;
		}
		System.out.println("while문 실행 후 : "+i);

	}

}
