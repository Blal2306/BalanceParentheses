import java.util.Scanner;


public class ParenthesesBalanced_main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("ENTER THE EXPRESSION : ");
		Scanner x = new Scanner(System.in);
		String in = x.next();
		
		System.out.println("THE EXPRESSION IS BALANCED : "+ParenthesesBalanced.isBalanced(in));
	}

}
