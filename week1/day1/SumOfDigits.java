package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		int input =123;
		int sum =0;
		int remainder;
		while (input>0) {
			remainder=input % 10;
			System.out.println("print the remainder to confirm");
			System.out.println(remainder);
			sum = sum + remainder;
			System.out.println("print the sum to confirm");
			System.out.println(sum);
			input = input/10;
			System.out.println("print the input to confirm");
			System.out.println(input);
		}
System.out.println("Sum of digits of given number:");
System.out.println(sum);
	}

}
