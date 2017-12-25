package ss.week1;

public class TrafficSignalLTest {

	public static void main(String[] args) {
		Lamp l1 = new Lamp();
		//System.out.println(l1.getSetting());
		//l1.switchSetting();
		int count = 0;
		int light = 0;
		while (count<5) {
			if (l1.getSetting()==light) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
			light = (light + 1) % 4;
			l1.switchSetting();
			count = count + 1;
		}

	}

}
