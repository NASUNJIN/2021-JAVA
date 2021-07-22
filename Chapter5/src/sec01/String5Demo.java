package sec01;
/**
 * 순천향대학교 사물인터넷학과 20201529 나선진
 * 강좌명 : 객체지향프로그래밍 (12761)
 * 주차 : 6주차
 * 설명 : 문자열
 * @author 나선진
 *
 */
public class String5Demo {

	public static void main(String[] args) {
		String version = String.format("%s %d", "JDK", 14);
        System.out.println(version);

        String fruits = String.join(", ", "apple", "banana", "cherry", "durian");
        System.out.println(fruits);

        String pi = String.valueOf(3.14);
        System.out.println(pi);
	}

}
