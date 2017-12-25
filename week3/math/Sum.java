package ss.week3.math;

public class Sum implements Function, Integrable{
	 private Function f1; 
	 private Function f2; 
	  
	 public Sum(Function f1, Function f2) { 
	  this.f1 = f1; 
	  this.f2 = f2; 
	 } 
	  
	 public Sum derivative() { 
	  return new Sum(f1.derivative(), f2.derivative()); 
	 } 
	  
	 public double apply(double arg) { 
	  return f1.apply(arg) + f2.apply(arg); 
	 } 
	 
	
	  
	
	 public Function integral() { 
	   return new Sum(((Integrable) f1).integral(), ((Integrable) f2).integral()); 
	 } 
	  
	 public String toString() { 
	  return "(" + f1.toString() + " + " + f2.toString() + ")";
}
}