package ss.week3.math;


public class Polynomial implements Integrable{
	LinearProduct[] poly;
	
	public Polynomial( double[] values) {
		poly=new LinearProduct[values.length];
		for(int i=0;i<values.length;i++) {
			poly[i]=new LinearProduct((Function) (new Exponent(values.length-i-1)),new Constant(values[i]));
		}
	}
	
	public Polynomial( LinearProduct[] values) {
		poly=new LinearProduct[values.length];
		for(int i=0;i<values.length;i++) {
			poly[i]=values[i];
		}
	}
	
	@Override
	public Integrable integral() {
		LinearProduct[] newPoly=poly;
		for (int i=0;i<newPoly.length;i++) {
			newPoly[i]=(LinearProduct) newPoly[i].integral();
		}
		return new Polynomial(newPoly);
	}

	@Override
	public double apply(double argument) {
		double ans=0;
		LinearProduct[] newPoly=poly;
		for (int i=0;i<newPoly.length;i++) {
			ans+=newPoly[i].apply(argument);
		}
		System.out.println(ans);
		return ans;
	}

	@Override
	public Integrable derivative() {
		LinearProduct[] newPoly= new LinearProduct[poly.length-1];
		for (int i=0;i<newPoly.length;i++) {
			newPoly[i]=(LinearProduct) poly[i].derivative();
		}
		return new Polynomial(newPoly);
	}
	/*
	private double[] arr;
	
	public Polynomial( double[] values) {
		arr = values;
	}
	
	public Function display() {
		Function atthemoment = new Constant(0);
		for(int i=arr.length-1;i>=0;i--) {
			double an = arr[i];
			Function part = new LinearProduct(new Exponent(i), new Constant(an)); 
			atthemoment= new Sum(part, atthemoment);
		 } 
		return atthemoment;
	}
		  
	@Override 
	public double apply(double args) {
		return display().apply(args);
	}
	@Override
		 public Function derivative() {
		return display().derivative();
		   
		 } 
		
	@Override
		 public String toString(){
			return display().toString();
	}
	
	@Override
	public Function integral() {
		//return  ((Integrable) display()).integral();
		double[] newValues= new double[arr.length+1];
		//for (int i=newValues.length-2;i>=0;i--) {
		//	newValues[i+1]=newValues[i]/(i+1);
		//}
		//newValues[0]=0;
		for(int i=0;i<arr.length-1;i++) {
			newValues[i]=arr[i]/(arr.length+1-i);
		}
		newValues[newValues.length-1]=0;
		System.out.println((new Polynomial(newValues)).display().apply(1.0));
		return (new Polynomial(newValues)).display();
	}
	
	//public static void main(String[] args) {
	//	Polynomial poly; 
	//	double[] arry = {3.0, 3.0}; 
	//	
	//	poly = new Polynomial(arry);
	//	System.out.println(((Integrable) poly).integral().apply(1.0));
	//}
	 * 
	 */
}
