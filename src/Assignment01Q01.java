
public class Assignment01Q01 {

	public static void main(String[] args) {
		// *** your code goes here below ***
		Assignment01Q01.ascii_5_divisible(args);
		}
	public static void ascii_5_divisible(String[] st_array) {
        for (String str : st_array) {
                char ch = str.charAt(0);
                int ascii = (int) ch;
                if (ascii % 5 == 0) {
                    System.out.println(ch);
                }
        	}
		}
}