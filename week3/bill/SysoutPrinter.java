package ss.week3.bill;

public class SysoutPrinter implements Printer { 
	
	
	public static void main(String[] args) {
		SysoutPrinter p =new SysoutPrinter();
		p.printLine("Text1", 1.0);
		p.printLine("Other Text", -12.1212);
		p.printLine("Something", .2);
	}
	
	

	
}
