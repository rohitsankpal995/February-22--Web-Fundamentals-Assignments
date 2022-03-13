package March_07_2022;

import java.util.Scanner;
public class longest_repeating_sequence {
	
	

	
		public static void main(String[] args) {
			String str = "abcggbdcmneabcbdc";
			getSubStringArray(str, 1, false);
		}

		static void getSubStringArray(String str, int length, boolean fill) {
			String subStringsarr[] = new String[length];
			String sub = "";
			int l = 0;
			int j = 0;
			for (int i = 0; i < str.length(); i++) {
				int end = str.length() + i - j;
				if (end > str.length()) {
					i = -1;
					j++;
					continue;
				}
				sub = str.substring(i, end);
				l++;
				if (fill) {
					subStringsarr[l - 1] = sub;
				}
			}
			if (subStringsarr[0] == null) {
				getSubStringArray(str, l, true);
			} else {
				checkRepeatingSequence(subStringsarr);
			}
		}

		static void checkRepeatingSequence(String arr[]) {
			int subLength = 0;
			for (int i = 0; i < arr.length; i++) {
				String element = arr[i];
				for (int j = i + 1; j < arr.length; j++) {
					if (element.contentEquals(arr[j]) && element.length() >= subLength) {
						System.out.println(element);
						subLength = element.length();
					}
				}
			}
		
	}

		

}
/*Output::
 * 	abc
 * 	bdc
 */
