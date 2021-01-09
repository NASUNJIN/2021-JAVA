package chapter2;

public class BinaryTest2 {

	public static void main(String[] args) {
		int num1 = 0B00000000000000000000000000000000101; //5
		long num2 = 0B11111111111111111111111111111111011L; //-5
		
		long sum = num1 + num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
	}

}
