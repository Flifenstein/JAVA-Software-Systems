package ss.week2.test;

import ss.week2.Lamp;

public class TrafficSignalLTest {

	public static void main(String[] args) {
		Lamp l1 = new Lamp();
		//System.out.println(l1.getSetting());
		//l1.switchSetting();
		int count = 0;
		Lamp.State light = Lamp.State.OFF;
		while (count<5) {
			if (l1.getSetting()==light) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			
			l1.switchSetting();
			count = count + 1;
			
			
			switch (light) {
				case OFF:
					light = Lamp.State.LOW;
					break;
				case LOW:
					light = Lamp.State.MEDIUM;
					break;
				case MEDIUM:
					light = Lamp.State.HIGH;
					break;
				case HIGH:
					light = Lamp.State.OFF;
					break;
			}
		}
			
	}

}


