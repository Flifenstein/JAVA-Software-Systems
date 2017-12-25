package ss.week4;

import java.util.List;
import java.util.ArrayList;
import java.lang.Comparable;

public class MergeSort {
	public static< E extends Comparable <E>> void mergeSort (List <E> list) {
		 ArrayList<E> left = new ArrayList<E>();
		ArrayList<E> right = new ArrayList<E>();
		 int center;
		 if(list.size()>1) {
		        center = list.size()/2;
		        for (int i=0; i<center; i++) {
		                left.add( list.get(i));
		        }
		 
		        for (int i=center; i<list.size(); i++) {
		                right.add( list.get(i));
		        }
		 
		       mergeSort(left);
		       mergeSort(right);
		        
		 } merge(left, right, list);
		        
		   }

	private static <E extends Comparable<E>> void merge(ArrayList<E> left, ArrayList<E> right, List<E> list) {
		 int leftIndex = 0;
		  int rightIndex = 0;
		  int listIndex = 0;
		  while (leftIndex < left.size() && rightIndex < right.size()) {
		      if (( left.get(leftIndex)).compareTo(right.get(rightIndex)) <=0) { 
		        list.set(listIndex++ , left.get(leftIndex++));
		      } 
		      else { 
		        list.set(listIndex++, right.get(rightIndex++));
		      }
		    }
		  
		  
		    while (leftIndex < left.size()) {
		      list.set(listIndex++, left.get(leftIndex++));
		    }  
		    
		   
		    while (rightIndex < right.size()) {
		      list.set(listIndex++, right.get(rightIndex++));
		    }
		
	}
}
	 