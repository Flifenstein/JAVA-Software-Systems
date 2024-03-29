package ss.week6;

public class Zipper {
    /*@
       requires s1 != null & s2 != null;
       requires s1.length() == s2.length();
     */
    public static String zip(String s1, String s2) {
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            result += Character.toString(s1.charAt(i))
                      + Character.toString(s2.charAt(i));
        }
        return result;
    }
    
    public static String ip2(String s1, String s2) {
    	try {
    		String result = " ";
    		if(s1==null) {
    			throw (new WrongArgumentException());
    		}for ( int i =0; i < s1.length(); i++) {
    			result += Character.toString(s1.charAt(i)) + Character.toString(s2.charAt(i));
    		}return null;
    		
    	}catch (WrongArgumentException e) {
    		System.out.print("Wrong answer");
    	}
    	return null;
    }
    

    public static void main(String[] args) {
        String s1 = args.length >= 1 ? args[0] : null;
        String s2 = args.length >= 2 ? args[1] : null;
        if (s1 == null || s2 == null) {
            System.out.println("error: too few command line arguments");
        } else if (s1.length() != s2.length()) {
            System.out.println("error: length of command line arguments "
                    + "differ (" + s1.length() + ", " + s2.length() + ")");
        } else {
            System.out.println(zip(s1, s2));
        }
    }
}
