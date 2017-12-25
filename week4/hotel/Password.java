package ss.week4.hotel;

public class Password {
	public static final java.lang.String INITIAL = "pizzas";
	
	private String pw;
	
	public Password(){
		pw = INITIAL;
	}
	
	public boolean acceptable(String password) {
		if(password.length()<6 || password.contains(" ")) {
			return false;
		}
		return true;
	}
	
	public boolean setWord(String oldPassword, String newPassword) {
		if(acceptable(newPassword) && testWord(oldPassword)) {
			pw = newPassword;
			return true;
		}
		return false;
	}
	
	//@pure
	public boolean testWord(String password) {
		if(password.contentEquals(pw)) {
			return true;
		}
		return false;
	}
}
