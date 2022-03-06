package March_o4_2022;

public class word_inside_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "Geekster";
		String str = "Hii Geekster";
		searchString(str, word);
	}

	static void searchString(String str, String word) {
		str = str.toLowerCase();
		word = word.toLowerCase();

		System.out.println(str);
		if (str.contains(word)) {
			System.out.print("word is present in str of index: " + str.indexOf(word));
		} else {
			System.out.println("word isn't present in str");
		}
	}
}
