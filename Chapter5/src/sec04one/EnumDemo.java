package sec04one;
/**
 * 순천향대학교 사물인터넷학과 20201529 나선진
 * 강좌명 : 객체지향프로그래밍 (12761)
 * 주차 : 7주차
 * 설명 : 열거
 * @author 나선진
 *
 */
public class EnumDemo {

	public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        if (gender == Gender.MALE)
            System.out.println(Gender.MALE + "은 병역 의무가 있다.");
        else
            System.out.println(Gender.FEMALE + "은 병역 의무가 없다.");

//        if (gender == Direction.SOUTH)
//            System.out.println(Direction.SOUTH + "는 누구?");
//        gender = 5;
    }
}

enum Gender { MALE, FEMALE }

enum Direction { EAST, WEST, SOUTH, NORTH }
