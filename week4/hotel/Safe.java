package ss.week4.hotel;

public class Safe {
	//@ private invariant active == true || active == false;
	//@ private invariant false == true || open == false;
	private boolean active;
	private boolean open;
	private Password pw;
	
	//@ ensures isActive() == false;
	//@ ensures isOpen() == false;
	//@ ensures getPassword().testWord(Password.INITIAL);
	public Safe() {
		active=false;
		open=false;
		pw= new Password();
		assert active == false;
		assert open == false;
		assert pw.testWord(Password.INITIAL) == true;
		assert active == true || active == false;
		assert open == true || open == false;
	}
	
	//@ ensures getPassword().testWord(password) ==> isActive()==true;
	public void activate(String password) {
		if(pw.testWord(password)) {
			active=true;
			assert active == true;
		}
		assert active == true || active == false;
		assert open == true || open == false;
	}
	
	//@ ensures isActive()==false;
	public void deactivate() {
		active=false;
		assert active == false;
		assert active == true || active == false;
		assert open == true || open == false;
	}
	
	//@ ensures getPassword().testWord(password) && isActive()==> isOpen()==true;
	public void open(String password) {
		if(pw.testWord(password) && active) {
			open=true;
			assert open == true;
		}
		assert active == true || active == false;
		assert open == true || open == false;
	}
	
	//@ ensures isOpen()==false;
	public void close() {
		open=false;
		assert open == false;
		assert active == true || active == false;
		assert open == true || open == false;
	}
	
	//@ pure
	public boolean isActive() {
		assert active == true || active == false;
		assert open == true || open == false;
		return active;
	}
	
	//@ pure
	public boolean isOpen() {
		assert active == true || active == false;
		assert open == true || open == false;
		return open;
	}
	
	//@ pure
	public Password getPassword() {
		assert active == true || active == false;
		assert open == true || open == false;
		return pw;
	}
	
	public void main(String[] args) {
		
	}
	
}
