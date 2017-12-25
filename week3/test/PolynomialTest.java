package ss.week3.test;
 
import static org.junit.Assert.*; 
 
import org.junit.Before; 
import org.junit.Test;

import ss.week3.math.Polynomial; 
 
public class PolynomialTest { 
 
 private Polynomial poly; 
 private double[] arr = {3.0, 3.0}; 
  
 @Before 
 public void setUp()  { 
  poly = new Polynomial(arr); 
 } 
 
 @Test 
 public void test() { 
  assertEquals("Check function returns correctly ", 6.0, poly.apply(1.0), 0.0001); 
  assertEquals("Check function #2 returns correctly ", 18.0, poly.apply(2.0), 0.0001); 
  assertEquals("Check derivative returns correctly ", 9.0, poly.derivative().apply(1.0), 0.0001); 
  assertEquals("Check derivative #2 returns correctly ", 15.0, poly.derivative().apply(2.0), 0.0001); 
  assertEquals("Check snd derivative returns correctly ", 6.0, poly.derivative().derivative().apply(1.0), 0.0001); 
 } 
 
}