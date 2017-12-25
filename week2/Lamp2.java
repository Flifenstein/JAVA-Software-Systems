package ss.week2;

public class Lamp2{
	//@ private invariant setting >=0 && setting <=3;
	
	
	private int setting;
	
	public static final int OFF = 0;
	public static final int LOW = 1;
	public static final int MEDIUM = 2;
	public static final int HIGH = 3;
	
	//@ ensures \old(getSetting())==OFF ==> getSetting()==LOW;
	//@ ensures \old(getSetting())==LOW ==> getSetting()==MEDIUM;
	//@ ensures \old(getSetting())==MEDIUM ==> getSetting()==HIGH;
	//@ ensures \old(getSetting())==HIGH ==> getSetting()==OFF;
	public void switchSetting () {
		setting = (setting + 1) % 4;
	}
	
	//@ pure
	public int getSetting() {
		return setting;
	}
	
	//@ ensures getSetting() == 0;
	public Lamp2() {
		setting = OFF;
	}
}
