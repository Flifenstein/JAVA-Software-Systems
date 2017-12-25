package ss.week1;

public class Employee {
	private int hours;
	private double rate;
	
	public Employee(int newHours, double newRate) {
		hours = newHours;
		rate = newRate;
	}
	
	public double pay() {
		if (hours<=40) {
			return hours*rate;
		} else {
			return 40*rate+(hours-40)*rate/2;
		}
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(43,10);
		System.out.println(e1.pay());
	}

}
