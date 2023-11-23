

public class recursion {
    public static void main(String[] args) {
        String str = "Hello, world!";
        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return "";
        } else {
            char firstChar = str.charAt(0);
            String remainingString = str.substring(1);
            String reversedString = reverseString(remainingString);
            return reversedString + firstChar;
        }
    }
}