package sec01;
/**
 * ��õ����б� �繰���ͳ��а� 20201529 ������
 * ���¸� : ��ü�������α׷��� (12761)
 * ���� : 6����
 * ���� : �迭
 * @author ������
 *
 */
public class arr {

	public static void main(String[] args) {
		int score1 = 100;
		int score2 = 90;
		int score3 = 50;
		int score4 = 95;
		int score5 = 85;
		
		int sum = score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;
		double average = sum / 5.0;
		
		System.out.printf("sum = %d, average = %f\n",sum, average);
		
		int[] scores = {100,90,50,95,85};
		int sum1 = 0;
		
		for(int i=0; i<5; i++)
			sum1=+ scores[i];
		double average1 = sum /5.0;
		System.out.printf("sum = %d, average = %f",sum1, average1);
		
		

	}

}
