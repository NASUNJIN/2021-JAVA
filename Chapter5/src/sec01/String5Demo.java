package sec01;
/**
 * ��õ����б� �繰���ͳ��а� 20201529 ������
 * ���¸� : ��ü�������α׷��� (12761)
 * ���� : 6����
 * ���� : ���ڿ�
 * @author ������
 *
 */
public class String5Demo {

	public static void main(String[] args) {
		String version = String.format("%s %d", "JDK", 14);
        System.out.println(version);

        String fruits = String.join(", ", "apple", "banana", "cherry", "durian");
        System.out.println(fruits);

        String pi = String.valueOf(3.14);
        System.out.println(pi);
	}

}
