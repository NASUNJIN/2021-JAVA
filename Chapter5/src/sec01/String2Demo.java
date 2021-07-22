package sec01;
/**
 * 순천향대학교 사물인터넷학과 20201529 나선진
 * 강좌명 : 객체지향프로그래밍 (12761)
 * 주차 : 6주차
 * 설명 : 문자열
 * @author 나선진
 *
 */
public class String2Demo {

	public static void main(String[] args) {
		String s1 = "Hi, Java!";
		String s2 = new String("Hi, Java!");
		String s3 = "Hi, Code!";
		String s4 = "Hi, java!";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));

		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s3.compareTo(s4));
		System.out.println("Hi, Java!".compareToIgnoreCase("hi, java!"));

	}

}
