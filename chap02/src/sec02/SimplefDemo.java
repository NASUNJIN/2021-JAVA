package sec02;
import java.util.Scanner;
public class SimplefDemo {
	/**
	 * ��õ����б� �繰���ͳ��а� 20201529 ������
	 * ���¸� : ��ü�������α׷��� (12761)
	 * ���� : 4����
	 * ���� : ���ǹ� ����
	 * @author ������
	 *
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		int number = in.nextInt();
		
		if(number %2==0)
			System.out.println("¦��!");
		if(number%2==1)
			System.out.println("Ȧ��!");
		System.out.println("����");
	}

}
