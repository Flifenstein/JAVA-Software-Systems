package ss.week6;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNextLine() ) {
			System.out.println();
			System.out.print("Type name: ");
		String myString = scanner.next();
		System.out.println();
		System.out.println("Hello "+ myString);
		}
		scanner.close();

	}
 
}
