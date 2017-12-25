package ss.week1.test;

public class DollarsAndCentsCounter {
	private int dollars;
	private int cents;
	
	public void add(int addDollars,int addCents) {
    	cents += addCents;
    	if (cents>99) {
    		dollars += 1;
    		cents -= 100;
    	}
    	dollars += addDollars;
    		
    }
    
    public void reset() {
    	cents = 0;
    	dollars = 0;
    }
    public int dollars() {
    	return dollars;
    }
    
	public int cents() {
		return cents;
	}

}
