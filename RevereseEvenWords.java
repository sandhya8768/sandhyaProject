package week1.day2;

public class RevereseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] word = test.split(" ");
		for (int i = 0; i < word.length; i++) {
			if (i%2!=0) {
				char[] temp=word[i].toCharArray();
				String rev="";
				for (int j = temp.length-1; j>=0; j--) {
					rev=rev+temp[j];
					word[i]=rev;
					
				}
			}
			System.out.print(word[i]+" ");
		}
		

	}

}
