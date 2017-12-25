package ss.week2;

public class Rectangle {
	
	//@ private invariant length >= 0;
	//@ private invariant width >= 0;
	
    private int length;
    private int width;

    /**
     * Create a new Rectangle with the specified length and width.
     */
    //@ requires length >=0;
    //@ requires width >=0;
    //@ ensures length() == length;
    //@ ensures width() == width;
    public Rectangle(int length, int width) {
    	assert length >= 0 && width >= 0;
    	this.length = length;
    	this.width = width;
    	assert this.length == length && this.width == width;
    	assert this.length >= 0;
    	assert this.width >= 0;
    }
    
    /**
     * The length of this Rectangle.
     */
    //@ ensures \result >= 0;
    //@ pure
    public int length() {
    	assert length >= 0 && width >= 0;
    	return length;
    }

    /**
     * The width of this Rectangle.
     */
    //@ ensures \result >= 0;
    //@ pure
    public int width() {
    	assert length >= 0 && width >= 0;
    	return width;
    }

    /**
     * The area of this Rectangle.
     */
    //@ ensures \result >= 0;
    //@ ensures \result == length()*width();
    //@ pure
    public int area() {
    	assert length >= 0 && width >= 0;
    	return length*width;
    }

    /**
     * The perimeter of this Rectangle.
     */
    //@ ensures \result >= 0;
    //@ ensures \result == 2*length() + 2*width();
    //@ pure
    public int perimeter() {
    	assert length >= 0 && width >= 0;
    	return 2*length+2*width;
    }
}
