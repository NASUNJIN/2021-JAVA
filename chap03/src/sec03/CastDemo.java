package sec03;
/**
 * 순천향대학교 사물인터넷학과 20201529 나선진
 * 강좌명 : 객체지향프로그래밍 (12761)
 * 주차 : 3주차
 * 설명 : 타입변환 예제
 * @author 나선진
 *
 */
public class CastDemo {

	public static void main(String[] args) {
		int i;
		double d;
		byte b;
		
		i = 7/4;  //1
		System.out.println(i);
		d = 7.0/4.0;  // 1.75가 나옴 but 7/4는 1.0 나옴 (double 이어서)
		System.out.println(d);
		d = 7/(double)4;  //1.75
		System.out.println(d);  //i = 7/(double)4;  >> 타입 불일치로 에러 발생
		
		i = 300;
		if(i<Byte.MIN_VALUE || i > Byte.MAX_VALUE) // byte의 최대값 127
			System.out.println("byte 타입으로 변환할 수 없습니다");
		else
			b = (byte)i;
	}

}
