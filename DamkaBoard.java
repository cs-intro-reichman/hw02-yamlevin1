/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int userNum = Integer.parseInt(args[0]);
		int row = 0;
		int asterisk = 0;
		
		//prints the pattern of the asterisks
		while(row < userNum) {
			if(row % 2 ==  0) {  //prints the row pattern of the asterisks depends if the row is even
				while(asterisk < userNum) {
					System.out.print("* ");
					asterisk++;
				}	
			}
			else {  //prints the row pattern of the asterisks depends if the row is not even
				while(asterisk < userNum) {
					System.out.print(" *");
					asterisk++;
				}
			}
			System.out.println();
			row++;
			asterisk = 0;
		}
	}
}
