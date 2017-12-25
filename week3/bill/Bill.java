package ss.week3.bill;

import java.util.ArrayList;

public class Bill {
	
	public static interface Item {
		
		public double  getAmount();
		public String toString();
		public String Description();

	}
	
	
	
	protected  StringPrinter costs;
	private ArrayList<Item> items = new ArrayList<Item>();

	
	public  Bill(StringPrinter printer) { 
			costs = printer;
		
	} 
	
	public void addItem(Bill.Item item) {  
			   items.add(item); 
			  
	 } 
		

	public void close() {
		System.out.println("Bill is" + getSum());
		
		
	}
	
	public double getSum() {
		double costs = 0.0;
		for(Item item : items) {
			costs += item.getAmount();
			
		}
		return costs;
		
	}

}
