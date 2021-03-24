package sec03;

public class VarDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 3주차
	 * 설명 : var 예약어 예제
	 * @author 나선진
	 *
	 */
	
	// var a = 1;  >>> 메서드 내부에서만 사용 가능
	public static void main(String[] args) {
		int var = 1; // 변수이름으로 사용 가능
		
		var x = 1;
		
		var xx = 23;  // 다수의 변수를 하나의 실행문으로 표현
		
		var aa = 10;  // null값 대입 가능
		
		var oops = 'a';  // 바로 초기화 하지 않으면 타입 추론 불가
		oops = 1;

	}
	
	// void test(var x) {}  // 타입 추론 불가

}
