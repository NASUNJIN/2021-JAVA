package sec02;

import java.util.Scanner;

/**
 * 순천향대학교 사물인터넷학과 20201529 나선진
 * 강좌명 : 객체지향프로그래밍 (12761)
 * 주차 : 6주차
 * 설명 : 배열
 * @author 나선진
 *
 */
public class Array1Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;

		for (int i = 0; i < scores.length; i++)
			scores[i] = in.nextInt();

		for (int i = 0; i < scores.length; i++)
			sum += scores[i];

		System.out.println("평균 = " + sum / 5.0);


	}

}
