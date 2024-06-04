

public class Assignment01Q02 {

	public static void main(String[] args) {
		// do not change this part below
		double piEstimation = 0.0;
		
		// *** your code goes here below ***
		int num = Integer.parseInt(args[0]);
		piEstimation = Assignment01Q02.myPi(num);
		// do not change this part below
		System.out.println(piEstimation + " " + Math.PI);

	}
	public static double myPi(int n) {
		if(n==0) {
			return 0;
		}
		double sum = 1;
		double sign = 1;
		double run = 1;
		for (int i = 1; i < n ; i++) {
			sign *= -1;
			run += 2;
			sum += sign*(1/run);
		}
		return 4*sum;
	}
}
