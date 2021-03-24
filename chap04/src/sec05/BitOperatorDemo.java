package sec05;

public class BitOperatorDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 4주차
	 * 설명 : 비트, 시프트연산자 예제
	 * @author 나선진
	 *
	 */
	public static void main(String[] args) {
		System.out.printf("%x\n",0b0101&0b0001);
		System.out.printf("%x\n",0b0101 | 0b0001);
		System.out.printf("%x\n",0b0101 ^ 0b0001);
		System.out.printf("%x\n",(byte) ~0b00000001);
		System.out.printf("%x\n",0b1100 >> 2);
		System.out.printf("%x\n",0b1100 << 2);
		
		int i1= -10;
		int i2 = i1 >>1;
		int i3 = i1 >>> 1;
		System.out.printf("%x -> %d\n", i1, i1);
		System.out.printf("%x -> %d\n", i2, i2);
		System.out.printf("%x -> %d\n", i3, i3);

	}

}
