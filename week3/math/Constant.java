package ss.week3.math;

public class Constant implements Function, Integrable {
	double constant;
	
	private double value; 
	  
	 public Constant(double value) { 
	  this.value = value; 
	 } 
	  
	 @Override 
	 public double apply(double argument) { 
	  return value; 
	 } 
	 
	 @Override 
	 public Function derivative() { 
	  return new Constant(0); 
	 } 
	  
	 public String toString() { 
	  return Double.toString(value); 
	 }


	@Override
	public Function integral() {
		return new LinearProduct( new Identity(), this);
	} 
	 
	 
}
