package ss.week4.hotel;

import ss.week3.bill.Bill;

public class PricedRoom extends Room implements Bill.Item {
	double roomPrice;
	public PricedRoom(int no, double price, double safePrice) {
		super(no,new PricedSafe(safePrice));
		roomPrice = price;
	} 

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		return roomPrice;
	}
	
	@Override
	public String toString() {
		return super.toString() + "/n Price is" + getAmount();
	}

	@Override
	public String Description() {
		// TODO Auto-generated method stub
		return "";
	}

}
