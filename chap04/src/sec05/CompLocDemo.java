package sec05;

public class CompLocDemo {
	/**
	 * ��õ����б� �繰���ͳ��а� 20201529 ������
	 * ���¸� : ��ü�������α׷��� (12761)
	 * ���� : 4����
	 * ���� : ������ ����
	 * @author ��������
	 *
	 */
	public static void main(String[] args) {
		int x=0, y=1;
		System.out.println((x<1)||(y--<1));
		System.out.println("x = "+x+" y = "+y);
		
		x=0;
		y=1;
		System.out.println((x<1)|(y--<1));
		System.out.println("x = "+x+" y = "+y);

	}

}
