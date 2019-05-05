package kata;

public class Kata {

	public static void main(String[] args) {

	}

}

class Solution {
	public static String whoLikesIt(String... names) {
		String str = null;
		switch (names.length) {
		case 0:
			str = "no one likes this";
		case 1:
			str = names[0] + " likes this";
		case 2:
			str = names[0] + " and " + names[1] + " like this";
		case 3:
			str = names[0] + ", " + names[1] + " and " + names[2] + " like this";
		case 4:
			str = names[0] + ", " + names[1] + " and " + names.length + " like this";

		}
		return str;

	}
}
