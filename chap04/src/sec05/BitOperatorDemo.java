package sec05;

public class BitOperatorDemo {
	/**
	 * ��õ����б� �繰���ͳ��а� 20201529 ������
	 * ���¸� : ��ü�������α׷��� (12761)
	 * ���� : 4����
	 * ���� : ��Ʈ, ����Ʈ������ ����
	 * @author ������
	 *
	 */
	public static void main(String[] args) {
		System.out.printf("%x\n",0b0101&0b0001);
		System.out.printf("%x\n",0b0101 | 0b0001);
		System.out.printf("%x\n",0b0101 ^ 0b0001);
		System.out.printf("%x\n",(byte) ~0b00000001);
		System.out.printf("%x\n",0b1100 >> 2);
		System.out.printf("%x\n",0b1100 << 2);
		
		int i1= -10;
		int i2 = i1 >>1;
		int i3 = i1 >>> 1;
		System.out.printf("%x -> %d\n", i1, i1);
		System.out.printf("%x -> %d\n", i2, i2);
		System.out.printf("%x -> %d\n", i3, i3);

	}

}
