package sec05;

public class OperatorPrecedenceDemo {
	/**
	 * ��õ����б� �繰���ͳ��а� 20201529 ������
	 * ���¸� : ��ü�������α׷��� (12761)
	 * ���� : 4����
	 * ���� : ������ �켱���� ����
	 * @author ������
	 *
	 */
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int z = ++x * y--;
		System.out.printf("%d\t%d\t%d\n",x,y,z);
		
		int year = 2020;
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

	}

}
