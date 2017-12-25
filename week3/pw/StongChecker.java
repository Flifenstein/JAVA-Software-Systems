package ss.week3.pw;
import java.lang.Character;

public class StongChecker extends BasicChecker {
	public boolean acceptable(String password) {
		/*checks last char is digit */
		
		int strLength = password.length();
		boolean x =Character.isDigit(password.charAt(strLength-1));
		
		/*checks first char is letter */
		boolean y= Character.isLetter(password.charAt(0));
		
		return (x && y);
		 
		 
		
	} 


}
