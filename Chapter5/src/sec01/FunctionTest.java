package sec01;
/**
 * ��õ����б� �繰���ͳ��а� 20201529 ������
 * ���¸� : ��ü�������α׷��� (12761)
 * ���� : 6����
 * ���� : �迭
 * @author ������
 *
 */
public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2);
		System.out.println(sum);
	}

	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}
