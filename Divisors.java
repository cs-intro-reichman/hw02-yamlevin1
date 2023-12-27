/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main(String[] args) {
		//number given by the user
		int userNum = Integer.parseInt(args[0]);
		
		//cheking the divisors of the given number
		for(int i = 1; i <= userNum; i++) {
			if(userNum % i == 0) {
				System.out.println(i);
			}
		}
	}
}