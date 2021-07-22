package sec02;
/**
 * 순천향대학교 사물인터넷학과 20201529 나선진
 * 강좌명 : 객체지향프로그래밍 (12761)
 * 주차 : 6주차
 * 설명 : 배열
 * @author 나선진
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();
		int data;
		int sum = 0;
		while ((data = in.nextInt()) >= 0)
			scores.add(data);
		for (int i = 0; i < scores.size(); i++)
			sum += scores.get(i);
		System.out.println("평균 = " + (double)sum / scores.size());
	}

}
