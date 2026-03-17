package String;

public class Palindrome {
    public static void main(String[] args) {
        String str = "level";
        String rev = " ";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (rev.equals(str)) {
            System.out.println("Palindrome String ");
        } else {
            System.out.println(" This is Not Palindrome ");
        }
    }
}
