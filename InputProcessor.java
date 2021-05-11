/**
 * @author cameron davison
 */

public class InputProcessor {
    /**
     * this is the Binary to Ascii method. it takes an input string and converts it into binary. it does this by
     * creating a byte array and fetching the bytes of the text parameter. it then uses a for loop that checks for every
     * byte in the bytes array, and for every byte another for loop is activated that checks that the new binary string
     * is below 8, while its below 8 . the given byte is then turned to either 1 or 0 and stored in the binary.append
     * function. and it is then returned as a string.
     *
     * @param text
     * @return
     */
    public static String asciiToBinary(String text) {
        text = "hi";
        byte[] bytes = text.getBytes();     //converts bytes variable into the bytes, stored in bytes array
        StringBuilder binary = new StringBuilder(); // creates binary object

        for (byte b : bytes) {          // for loop for b variable in bytes array.
            int num = b;
            for (int i = 0; i < 8; i++) {
                binary.append((num & 128) == 0 ? 0 : 1);
                num <<= 1;
            }
        }
        return binary.toString();
    }

    /**
     * this method is the opposite of the asciitobinary as it essentially swaps what needs to be done.
     * it does the same as the ascii to binary, by converting the text into bytes and creating a Stringbuilder object.
     * however what it does differently is instead of using a for loop to check the bytes, it just uses a for loop to
     * check that the integer is below or equal to 8, and for every loop of this, we convert the integer into a char and
     * create a substring so that it begins at the starting index of i and ends at the index of i + 8 with a radix of 2.
     *
     * @param text
     * @return
     */
    public static String binaryToAscii(String text) {
        text = "01000001";
        byte[] bytes = text.getBytes();     //converts bytes variable into the bytes, stored in bytes array
        StringBuilder binary = new StringBuilder(); //creates binary object

        for (int i = 0; i < bytes.length; i += 8) {
            binary.append((char) Integer.parseInt(text.substring(i, i + 8), 2));

        }
        return binary.toString();
    }


    /**
     * here i have used a for loop that continues to loop until it reaches half way into the String. for every loop
     * the if statement will check that the character entered is the same as the character that is stored in the
     * opposite position in the String, if it is not equal then it will return false.
     * @param text
     * @return
     */

    public static boolean isPalindrome(String text) {
        for (int i = 0 ; i < text.length()/2;i++){     //for loop where i gets half of the text string
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) // if text at start and end isnt equal return
                return false;                                                           //false
        }
        return true;
    }
}


