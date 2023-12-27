/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) {
		//string given by the user
		String userString = args[0];
		String result = "";
		
		//given string in reversed order
		for(int i = 0; i < userString.length(); i++) {
			result = result + userString.charAt(userString.length() - (1 + i));
		}
		
		int middleCharLocation = 0;
		
		//finds the middle char location dependence if the string length is even or odd
		if(userString.length() % 2 == 0) {
			middleCharLocation = (userString.length() / 2) - 1;
		}
		else{
			middleCharLocation = (userString.length() / 2);
		}
		
		char middleChar = userString.charAt(middleCharLocation);
		System.out.println(result);
		System.out.println("The middle character is " + middleChar);
	}
}
