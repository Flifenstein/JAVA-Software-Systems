package ss.week2;

public class Lamp{
	public enum State {OFF, LOW, MEDIUM, HIGH}
	
	
	private State setting;
	
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	
	/*@
	   ensures \old(getSetting())==State.OFF ==> getSetting()==State.LOW;
	   ensures \old(getSetting())==State.LOW ==> getSetting()==State.MEDIUM;
	   ensures \old(getSetting())==State.MEDIUM ==> getSetting()==State.HIGH;
	   ensures \old(getSetting())==State.HIGH ==> getSetting()==State.OFF;
	 
	 */
	public void switchSetting () {
		switch (setting) {
			case OFF:
				setting = State.LOW;
				break;
			case LOW:
				setting = State.MEDIUM;
				break;
			case MEDIUM:
				setting = State.HIGH;
				break;
			case HIGH:
				setting = State.OFF;
				break;
		}
	}
	
	//@ pure
	public State getSetting() {
		return setting;
	}
	
	//@ ensures getSetting() == State.OFF;
	public Lamp() {
		setting = State.OFF;
	}
}
