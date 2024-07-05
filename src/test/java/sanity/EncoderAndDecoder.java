package sanity;

import java.util.Base64;

public class EncoderAndDecoder {


    public static String getEncodedText(String value) {

        byte[] encodedByte = Base64.getEncoder().encode(value.getBytes());
        String encodedString = new String(encodedByte);
        return encodedString;
    }

    public static String getdecodedText(String value) {
        byte[] decodedByte = Base64.getDecoder().decode(value.getBytes());
        String decodedString = new String(decodedByte);
        return decodedString;
    }


}
