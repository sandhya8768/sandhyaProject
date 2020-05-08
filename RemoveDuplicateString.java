package week1.day2;

public class RemoveDuplicateString {

	public static void main(String[] args) {
	String text ="we learn java basics as part of java sessions in java week1";
	int count =0;
	String word[]=text.split(" ");
	for (int i = 0; i < word.length; i++) {
		for (int j = i+1; j < word.length; j++) {
			count =0;
			if (word[i].equalsIgnoreCase(word[j])) {
				count= count + 1;
				
			}
		}
		if (count>=1) {
		word[i]=word[i].replace(word[i], "");
		
		}
		System.out.print(word[i]+" ");
	}
	}

}
