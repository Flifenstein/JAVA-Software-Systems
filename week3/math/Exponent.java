 package ss.week3.math;

public class Exponent implements Function, Integrable {

	 private double exponent; 
	  
	 public Exponent(double exponent) { 
	  this.exponent = exponent; 
	 } 
	  
	 public double apply(double argument) { 
	  return Math.pow(argument, exponent); 
	 } 
	 
	 public Function derivative() { 
	   return new LinearProduct(new Exponent(exponent-1), new Constant(exponent)); 
	 } 
	
	  
	 public String toString() { 
	  return "(x^" + exponent + ")"; 

}

	
	@Override
	public Function integral() {
		return (new LinearProduct( new Exponent(exponent+1), new Constant(1/(exponent+1))));
	}
} 