package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
	String A ="madam";
	String rev ="";
	for (int i = A.length()-1; i>=0; i--) {
		rev=rev+A.charAt(i);
		
		
	}
	
	if(A.equalsIgnoreCase(rev)) {
		System.out.println("is a palindrome");
	}
	else {
		System.out.println("is not a palindrome");
	}
	}

	}


