package week1.day2;
public class CharOccurance {
public static void main(String[] args) {
      String str = "welcome to chennai";
		int count = 0;
		char[] charcterocur = str.toCharArray();
		// System.out.println(str.length());
		for (int i = 0; i < charcterocur.length; i++) {
			if (charcterocur[i] == 'e') {
				count = count + 1;
			}

		}
		System.out.println(count);
	}

}
