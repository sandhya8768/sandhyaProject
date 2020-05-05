package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
	int	input=153;
	int calculated=0;
	int remainder;
	int original;
	original = input;
	while(input!=0)
	{
		remainder = input % 10;
		input = input / 10;
         calculated  = calculated +(remainder * remainder * remainder);
         	
	}
	if(calculated==original) {
		System.out.println(calculated + " is an Armstrong number");
	}
		else {	
		System.out.println(calculated + " is not Armstrong number");
	}
	}
		
	}


