package ss.week3.math;

public class Identity implements Function,Integrable {

	
	public Identity() {
		
	}
	
	public double apply(double args) {
		return args;
	}

	@Override
	public Function derivative() {
		return new Constant(1); 
	}

	@Override
	public Function integral() {
		return new Product(  new Constant(0.5), new Exponent(2));
	}
	
	
}
