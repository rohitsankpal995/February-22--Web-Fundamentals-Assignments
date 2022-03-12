package March_o4_2022;
import java.util.*;
public class replace_subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String sentence = "Hii  Master";
		System.out.println(sentence);
		System.out.print("Word to place: ");
		String wordTOPlace = s.next();
		System.out.print("Word to replace: ");
		String wordToReplaca = s.next();
		replace(sentence, wordTOPlace, wordToReplaca);
	}

	static void replace(String sentence, String wordPlace, String wordReplace) {
		String newStr = sentence.replace(wordReplace, wordPlace);
		System.out.println("Modified String: " + newStr);
	}
}

//OUTPUT
/*
	Hii  Master
	Word to place: Geek
	Word to replace: Ma
	Modified String: Hii Geekster
*/


