package sec04two;
/**
 * 순천향대학교 사물인터넷학과 20201529 나선진
 * 강좌명 : 객체지향프로그래밍 (12761)
 * 주차 : 7주차
 * 설명 : 열거
 * @author 나선진
 *
 */
public class EnumDemo2 {

	public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        if (gender == Gender.MALE)
            System.out.println(Gender.MALE + "은 병역 의무가 있다.");
        else
            System.out.println(Gender.FEMALE + "은 병역 의무가 없다.");

        for(Gender g : Gender.values())
            System.out.println(g.name());

        System.out.println(Gender.valueOf("MALE"));
    }
}
enum Gender {
    MALE("남성"), FEMALE("여성");

    private String s;

    Gender(String s) {
        this.s = s;
    }

    public String toString() {
        return s;

	}

}
