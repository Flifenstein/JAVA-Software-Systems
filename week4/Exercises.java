package ss.week4;

public class Exercises {
    public static int countNegativeNumbers(int[] arr) {
        // TODO: implement, see exercise P-4.1
    	int c=0;
    	for(int i =0; i<= arr.length-1; i++) {
    		if(arr[i]<0)
    			c++;
    	}
    	return c;
    }
 
    public static void reverseArray(int[] ints) {
        // TODO: implement, see exercise P-4.2
    	int aux;
    	for(int i=0;i<ints.length/2;i++) {
    			aux=ints[i];
    			ints[i]=ints[ints.length-i-1];
    			ints[ints.length-i-1]=aux; 
    		
    	}
    }

    class SimpleList {
        public class Element {}

        public class Node {
            public Node next;
            public Element element;
        }

        private Node first;

        private Node find(Element element) {
            Node p = first;
            if (p == null) {
                return null;
            }
            while (p.next != null && !p.next.element.equals(element)) {
                p = p.next;
            }
            if (p.next == null) {
                return null;
            } else {
                return p;
            }
        }

        public void remove(Element element) {
            Node p = find(element);
            if (p != null) {
                p.next = p.next.next;
            }
        }
    }
}
