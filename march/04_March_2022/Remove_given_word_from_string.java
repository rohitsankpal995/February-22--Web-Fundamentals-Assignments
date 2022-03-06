package March_o4_2022;
import java.util.*;
public class Remove_given_word_from_string {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "Hii  Geekster";
		System.out.print(str + "\nEnter the word to remove: ");
		String word = s.next();
		removeWord(str, word);
	}

	static void removeWord(String str, String word) {
		String newStr = "";
		if (str.contains(word)) {
			newStr = str.replace(word, "");
		} else {
			newStr = "word not found";
		}
		System.out.println("Modified String: " + newStr);
	}
}

//OUTPUT
/*
	Hii  Geekster
	Enter the word to remove: Hii
	Modified String:  Geekster
*/