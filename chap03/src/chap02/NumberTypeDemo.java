package chap02;
/**
 * ��õ����б� �繰���ͳ��а� 20201529 ������
 * ���¸� : ��ü�������α׷��� (12761)
 * ���� : 3����
 * ���� : ������, �� ����
 * @author ������
 *
 */
public class NumberTypeDemo {

	public static void main(String[] args) {
		int mach;
		int distance;
		mach = 340;
		distance = mach*60*60;
		System.out.println("�Ҹ��� 1�ð� ���� ���� �Ÿ� : " + distance + "m");
		
		double radius;
		double area;
		radius = 10.0; //�Ǽ��� ��Ÿ�ٴ� ��
		area = radius * radius * 3.14;
		System.out.println("�������� " + radius + "�� ���� ���� : "+ area);
	}

}
