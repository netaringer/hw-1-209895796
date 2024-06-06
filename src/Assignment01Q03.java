import java.util.Arrays;
public class Assignment01Q03 {

	public static void main(String[] args) {
		int numOfOdd = 0;
		int n = Integer.parseInt(args[0]);
		// *** your code goes here below ***
		int[] fib_arr = Assignment01Q03.fibonacci(n);
		System.out.println("The first "+ n +" Fibonacci numbers are:");
		// *** your code goes here below ***
		String fib_numbers = Assignment01Q03.iarr_to_string(fib_arr);
		System.out.println(fib_numbers);
		numOfOdd = Assignment01Q03.odd_num(fib_arr);
		System.out.println("The number of odd numbers is: "+numOfOdd);
	}
	public static int[] fibonacci(int n) {
		int[] fib_arr = new int[n];
		fib_arr[0] = 1;
		int prev = 0;
		int curr = 1;
		for(int i = 1; i < n; i++) {
			curr += prev;
			fib_arr[i] = curr;
			prev = curr - prev;
		}
		return fib_arr; 
	}
	public static int odd_num(int[] arr) {
		int cnt = 0;
		for(int num: arr) {
			if(num%2!=0) {
				cnt += 1;
			}
		}
		return cnt;
	}
	public static String iarr_to_string(int[] arr) {
		String str = "";
		for(int num: arr) {
			str +=" " + Integer.toString(num);
		}
		return str.trim();
	}
}