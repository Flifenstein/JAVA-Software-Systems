 package ss.week1;

public class Lamp{
	private int setting = 0;
		//0=off
		//1=low
		//2=medium
		//3=high
		
	public void switchSetting () {
		setting = (setting + 1) % 4;
	}
	
	public int getSetting() {
		return setting;
	}

	public Lamp() {
		setting = 0;
	}
}
