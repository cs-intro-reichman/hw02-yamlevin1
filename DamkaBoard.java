/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int userNum = Integer.parseInt(args[0]);
		int row = 0;
		int astrisk = 0;
		
		//prints the pattern of the asterisks
		while(row < userNum) {
			if(row % 2 ==  0) {  //prints the row pattern of the asterisks depends if the row is even
				while(astrisk < userNum) {
					System.out.print("* ");
					astrisk++;
				}	
			}
			else {  //prints the row pattern of the asterisks depends if the row is not even
				while(astrisk < userNum) {
					System.out.print(" *");
					astrisk++;
				}
			}
			System.out.println();
			row++;
			astrisk = 0;
		}
	}
}
