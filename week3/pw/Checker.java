package ss.week3.pw;

public interface Checker {
	public default boolean acceptable(String password) {
	return !(password.length()<6 || password.contains(" ")) ;
	}
		
	public String generatePassword();
	
	 

}
