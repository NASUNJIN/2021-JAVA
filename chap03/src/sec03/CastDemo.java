package sec03;
/**
 * ��õ����б� �繰���ͳ��а� 20201529 ������
 * ���¸� : ��ü�������α׷��� (12761)
 * ���� : 3����
 * ���� : Ÿ�Ժ�ȯ ����
 * @author ������
 *
 */
public class CastDemo {

	public static void main(String[] args) {
		int i;
		double d;
		byte b;
		
		i = 7/4;  //1
		System.out.println(i);
		d = 7.0/4.0;  // 1.75�� ���� but 7/4�� 1.0 ���� (double �̾)
		System.out.println(d);
		d = 7/(double)4;  //1.75
		System.out.println(d);  //i = 7/(double)4;  >> Ÿ�� ����ġ�� ���� �߻�
		
		i = 300;
		if(i<Byte.MIN_VALUE || i > Byte.MAX_VALUE) // byte�� �ִ밪 127
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�");
		else
			b = (byte)i;
	}

}
