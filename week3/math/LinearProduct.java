package ss.week3.math;

public class LinearProduct extends Product implements Integrable {
	
	public LinearProduct(Function function, Constant f2) { 
		  super(function, f2); 
		 } 
		  
	public Function derivate() {
		return new LinearProduct(f1.derivative(),((Constant) f2));
	}
	
	 
		 public Function integral() { 
		  
		   return new LinearProduct(((Integrable) f1).integral(), (Constant) f2); 
 
		 } 

		
		
}
