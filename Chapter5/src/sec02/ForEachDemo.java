package sec02;
/**
 * ��õ����б� �繰���ͳ��а� 20201529 ������
 * ���¸� : ��ü�������α׷��� (12761)
 * ���� : 6����
 * ���� : �迭
 * @author ������
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
		
		System.out.println("��� = "+sum/5.0);

	}

}
