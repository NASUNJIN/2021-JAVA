package sec02;
/**
 * 순천향대학교 사물인터넷학과 20201529 나선진
 * 강좌명 : 객체지향프로그래밍 (12761)
 * 주차 : 6주차
 * 설명 : 배열
 * @author 나선진
 *
 */
public class ForEachDemo {

	public static void main(String[] args) {
		int[] one2five = {0,1,2,3,4};
		int sum=0;
		
		for(int x =0; x< one2five.length; x++)
			one2five[x]++;
		
		for(int x : one2five)
			sum+=x;
		
		System.out.println("평균 = "+sum/5.0);

	}

}
