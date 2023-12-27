/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main(String[] args) {
		int userNum = Integer.parseInt(args[0]);
		int sum = 0;
		String str = "";
		
		for(int i = 2; i < userNum; i++) {
			if(userNum % i == 0) { //cheks the divisors of the given number
				sum += i; //calculates the sum of the dividors
				String fromIntToString = Integer.toString(i);
				str = str + " + " + fromIntToString; //saves the dividors as a string
			}
		}
		
		//cheks if the number is perfect
		if((sum + 1) == userNum) {
			System.out.println(userNum + " is a perfect number since " + userNum + " = 1" + str);
		}
		else {
			System.out.println(userNum + " is not a perfect number");
		}
	}
}
