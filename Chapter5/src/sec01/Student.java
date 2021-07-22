package sec01;
/**
 * 순천향대학교 사물인터넷학과 20201529 나선진
 * 강좌명 : 객체지향프로그래밍 (12761)
 * 주차 : 6주차
 * 설명 : 배열
 * @author 나선진
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