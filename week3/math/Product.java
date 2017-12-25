package ss.week3.math;

public class Product implements Function {
	 protected Function f1; 
	 protected Function f2; 
	  
	 public Product(Function exponent, Function f2) { 
	  this.f1 = exponent; 
	  this.f2 = f2; 
	 } 
	  
	 @Override 
	 public double apply(double argument) { 
	  return f1.apply(argument) * f2.apply(argument); 
	 } 
	 
	 @Override 
	 public Function derivative() { 
	  return new Sum(new Product(f1.derivative(), f2), new Product(f2.derivative(), f1)); 
	 } 
	  
	 public String toString() { 
	  return "(" + f2.toString() + " * " + f1.toString() + ")"; 
	 } 

}
 