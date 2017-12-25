package ss.week3.bill;

public interface Printer {
	public default String format( String text, double price) {
		return String.format("%1$-30s  %2$10.2f",text, price) + " ";
	}
	
	public default void printLine(String text, double price) {
		
		System.out.println(format(text,price));
	}	

}
