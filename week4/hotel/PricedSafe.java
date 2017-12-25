package ss.week4.hotel;

public class PricedSafe extends Safe implements ss.week3.bill.Bill.Item{
	double safePrice;
	
	public PricedSafe(double price) {
		safePrice=price;
	}
	
	@Override
	public double getAmount() {
		return safePrice;
	}
	
	@Override
	public String toString() {
		return "Price of the safe is " + this.getAmount();
	}

	@Override
	public String Description() {
		// TODO Auto-generated method stub
		return null;
	}
}
