package week1.day1;

public class FibanociSeries {

	public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		int range= 8;
		int sum;
		
		for (int i = 1; i <= range; i++) {
			System.out.println(firstNum);
			
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			
			
		}

	}

}
