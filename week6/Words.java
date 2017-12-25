package ss.week6;
import java.util.Scanner;


public class Words {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
		   String[] words = scanner.nextLine().split("\\s+");
		   int itemCount = words.length;
		   System.out.println("The number of words is: " + itemCount);
		   for (int i = 0; i < itemCount; i++) {
		      String word = words[i];
		      System.out.println(i + ": "+ word);
		   }
		   break; 
		} 
			
			 
		  
		 scanner.close();
	
		}

}
