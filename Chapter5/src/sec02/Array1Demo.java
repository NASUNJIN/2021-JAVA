package sec02;

import java.util.Scanner;

/**
 * ��õ����б� �繰���ͳ��а� 20201529 ������
 * ���¸� : ��ü�������α׷��� (12761)
 * ���� : 6����
 * ���� : �迭
 * @author ������
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

		System.out.println("��� = " + sum / 5.0);


	}

}
