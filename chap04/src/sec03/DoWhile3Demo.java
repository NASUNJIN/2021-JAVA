package sec03;

public class DoWhile3Demo {
	/**
	 * ��õ����б� �繰���ͳ��а� 20201529 ������
	 * ���¸� : ��ü�������α׷��� (12761)
	 * ���� : 4����
	 * ���� : �ݺ���(Do ~ While) ������ ����
	 * @author ������
	 *
	 */
	public static void main(String[] args) {
		int row = 2;
		do {
			int column = 1;
			do {
				System.out.printf("%4d",row*column);
				column++;
			}while(column<10);
			System.out.println();
			row++;
		}while(row<10);

	}

}
