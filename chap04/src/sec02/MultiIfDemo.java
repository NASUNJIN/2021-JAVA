package sec02;
import java.util.Scanner;
public class MultiIfDemo {
	/**
	 * 순천향대학교 사물인터넷학과 20201529 나선진
	 * 강좌명 : 객체지향프로그래밍 (12761)
	 * 주차 : 4주차
	 * 설명 : 다중 If 예제
	 * @author 나선진
	 *
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String grade;
		System.out.print("점수를 입력하세요 : ");
		int score = in.nextInt();
		
		if(score>=90)
			grade="A";
		else if (score >=80)
			grade="B";
		else if (score >=70)
			grade="C";
		else if (score >=60)
			grade="D";
		else
			grade="F";
		System.out.println("당신의 학점은 "+grade);

	}

}
