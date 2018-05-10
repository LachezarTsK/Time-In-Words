import java.util.*;

public class Solution {


		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		String tw = "twenty";

		if (m > 0 && m <= 30) {
			System.out.print(numNames[m]);
			if (m == 1) {
				System.out.print(" minute past");
			} else if (m == 15) {
				System.out.print(" past ");
			}
			else if (m == 30) {
				System.out.print(" past ");
			}
			else {
				System.out.print(" minutes past ");
			}
			System.out.print(numNames[h]);
		} else if (m > 30 && m < 60) {
			System.out.print(numNames[60 - m]);
			if (60 - m == 15) {
				System.out.print(" to ");
			} else {
				System.out.print(" minutes to ");
			}
			System.out.print(numNames[h + 1]);
		} else if (m == 0) {
			System.out.print(numNames[h]);
			System.out.print(" o' clock ");
		}
	}

	private static final String[] numNames = { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen",
			"nineteen", "twenty", "twenty one", "twenty two", "twenty thrre", "twenty four", "twenty five",
			"twenty six", "twenty seven", "twenty eight", "twenty nine", "half" };

}
