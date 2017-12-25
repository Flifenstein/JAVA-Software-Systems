package ss.week3.pw;
import java.lang.System;


public class TimedPassword extends Password{
	private long validTime;
	
	public TimedPassword(long argument) {
		
		validTime =  System.currentTimeMillis() +1000*argument;
	}
	
	public TimedPassword() {
		validTime = System.currentTimeMillis() + 60000;
	}
	
	public boolean isExpired() {
		return (System.currentTimeMillis() >= validTime);
	}
	
	@Override
	public boolean setWord(String oldPassword, String newPassword) {
		if(acceptable(newPassword) && testWord(oldPassword)) {
			pw = newPassword;
			validTime = System.currentTimeMillis() +60000;
			return true;
		}
		return false;
	}
	
	/*@Override
	public boolean testWord(String oldPassword) {
		if(isExpired()) {
			return false;
		}
		else {
			return super.testWord(oldPassword);
		}
	}*/

}
