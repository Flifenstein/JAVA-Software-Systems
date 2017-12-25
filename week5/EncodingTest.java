package ss.week5;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.Base64;

/**
 * A simple class that experiments with the Hex encoding
 * of the Apache Commons Codec library.
 *
 */
public class EncodingTest {
    public static void main(String[] args) throws DecoderException {
        String input = "Hello World";
        System.out.println(Hex.encodeHexString(input.getBytes()));
        
        String h = "48656c6c6f20576f726c64";
        byte[] bites = Hex.decodeHex(h);
        System.out.println(new String(bites));
        
        String input2 = "Hello World";
        System.out.println(Base64.encodeBase64String(input2.getBytes()));
        
        String h2 = "010203040506";
        byte[] bites2 = Hex.decodeHex(h2); 
        System.out.println(Base64.encodeBase64String(bites2));
        
        String h3 = "U29mdHdhcmUgU3lzdGVtcw==";
        byte[] bites3 = Base64.decodeBase64(h3); 
        System.out.println(new String(bites3));
        
        String h4 = "";
        for(int i=0; i<10;  i++) {
        	h4+='a';
        	System.out.println(h4);
            byte[] bites4 = Base64.decodeBase64(h4);
            System.out.println(new String(bites4));
        }
    }
}
