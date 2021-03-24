package chap02;
/**
 * 순천향대학교 사물인터넷학과 20201529 나선진
 * 강좌명 : 객체지향프로그래밍 (12761)
 * 주차 : 3주차
 * 설명 : 반지름, 원 넓이
 * @author 나선진
 *
 */
public class NumberTypeDemo {

	public static void main(String[] args) {
		int mach;
		int distance;
		mach = 340;
		distance = mach*60*60;
		System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");
		
		double radius;
		double area;
		radius = 10.0; //실수를 나타넨는 값
		area = radius * radius * 3.14;
		System.out.println("반지름이 " + radius + "인 원의 넓이 : "+ area);
	}

}
