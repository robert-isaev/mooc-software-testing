package tudelft.caesarshift;

public class CaesarShiftCipher {

    public static int numberOfLettersInAlphabet = 26;

    public String encode(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();

        shift = shift%numberOfLettersInAlphabet;

        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);
           
            if (currentChar > 'z' || currentChar < 'a') {
                return "invalid";
            } else if ((char) (currentChar + shift) > 'z') {
                currentChar = (char) (currentChar - 26);
            } else if ((char) (currentChar + shift) < 'a'){
                currentChar = (char) (currentChar + 26);
            }
            sb.append((char) (currentChar + shift));
        }

        return sb.toString();
    }
}
