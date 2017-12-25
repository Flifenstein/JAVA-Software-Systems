package ss.week3.bill;

public class StringPrinter implements Printer {
	private String line = "";
	@Override
		public void printLine(String text, double price) {
		
		line = line + format(text,price);
	}	
	
	public String getResult() {
		return line;
	}
	public static void main(String[] args) {
		StringPrinter p =new StringPrinter();
		p.printLine("Text1", 1.0);
		p.printLine("Other Text", -12.1212);
		p.printLine("Something", .2);
		p.getResult();
	}

}
 