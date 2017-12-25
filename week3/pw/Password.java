package ss.week3.pw;

public class Password  {
	
	
	protected String pw;
	private String factoryPassword ;
	private Checker checker;
	
	public Password(){
		this(new BasicChecker());
		
	}
	
	public Password(Checker c) {
		factoryPassword =c.generatePassword();;
		pw = factoryPassword;
		checker = c;
		
	}
	
	
	public boolean acceptable(String password) {
		return checker.acceptable(password);
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
