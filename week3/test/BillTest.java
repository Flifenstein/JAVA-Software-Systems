package ss.week3.test;

import static org.junit.Assert.assertEquals;
import static  org.junit.Assert.assertTrue;
import org.junit.Before; 
import org.junit.Test;

import ss.week3.bill.Bill;
import ss.week3.bill.StringPrinter;

class BillTest {
	public class Item implements Bill.Item {
		String text;
		String description;
		double amount;
		
		public Item(String text, double amount){
			this.text=text;
			this.amount=amount;
		}

		@Override
		public double getAmount() {
			return amount;
		}

		@Override
		public String toString() {
			return text;
		}

		@Override
		public String Description() { 
			return description;
		}
	
	}
	StringPrinter p;
	Bill b;
	Item i1;
	Item i2;
	Item i3;
	private static final double DELTA = 1e-15;
	
	@Before
	void Setup() {
		p = new StringPrinter();
		b = new Bill(p);
		i1 =new Item("TestProduct1",0.99);
		i2 =new Item("TestProduct2",1.99);
		i3 =new Item("TestProduct3",1.02);
	}
	
	@Test
	void testItemName() {	
		b.addItem(i1);
		assertEquals("TestProduct1",i1.toString());	
	}
	
	@Test
	void testItemPrice() {	
		b.addItem(i1);
		assertEquals(0.99,i1.getAmount(),DELTA);	
	}
	
	@Test
	void testCloseAndSumFirst() {
		b.addItem(i1);
		b.close();
		assertEquals(0.99,b.getSum(),DELTA);
	}
	
	@Test
	void testSumSecond() {
		b.addItem(i1);
		b.addItem(i2);
		b.addItem(i3);
		b.close();
		assertEquals(i1.getAmount()+i2.getAmount()+i3.getAmount(),b.getSum(),DELTA);
	}
}

