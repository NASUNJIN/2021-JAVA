package sec03;

public class For2Demo {
	/**
	 * ��õ����б� �繰���ͳ��а� 20201529 ������
	 * ���¸� : ��ü�������α׷��� (12761)
	 * ���� : 4����
	 * ���� : �ݺ���(for) ����
	 * @author ������
	 *
	 */
	public static void main(String[] args) {
		for(int row = 2; row <10; row++) {
			for(int column =1; column <10; column++) {
				System.out.printf("%4d",row*column);
			}
			System.out.println();
		}

	}

}
