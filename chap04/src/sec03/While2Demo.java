package sec03;

public class While2Demo {
	/**
	 * ��õ����б� �繰���ͳ��а� 20201529 ������
	 * ���¸� : ��ü�������α׷��� (12761)
	 * ���� : 4����
	 * ���� : while�� ������ ����
	 * @author ������
	 *
	 */
	public static void main(String[] args) {
		int row=2;
		while (row<10){
			int column = 1;
			while (column<10) {
				System.out.printf("%4d", row*column);
				column++;
			}
			System.out.println();
			row++;
		}

	}

}
