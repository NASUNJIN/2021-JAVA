package sec01;
/**
 * ��õ����б� �繰���ͳ��а� 20201529 ������
 * ���¸� : ��ü�������α׷��� (12761)
 * ���� : 6����
 * ���� : �迭
 * @author ������
 *
 */
public class Student {
	
	int sutdentID;
	String studentName;
	int grade;
	String address;

	public void showStudentInfor() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getstudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}