package sec05;

public class TernaryOperatorDemo {
	/**
	 * ��õ����б� �繰���ͳ��а� 20201529 ������
	 * ���¸� : ��ü�������α׷��� (12761)
	 * ���� : 4����
	 * ���� : ���ǿ����� ����
	 * @author ������
	 *
	 */
	public static void main(String[] args) {
		int x = 1;
		int y;
		y =(x==1)?10:20;
		System.out.println(y);
		y=(x>1)?x++:x+20;
		System.out.println(x);
		System.out.println(y);

	}

}
