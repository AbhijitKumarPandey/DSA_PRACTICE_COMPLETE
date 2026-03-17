package String;

public class Valid_Dpalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        int i=0;
        int j = str.length()-1;

        while(i<j){
            while(i<j&&!Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }
            while(i<j && ! Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }
           // if(Character.toLowerCase((str.charAt(i)!=Character.toLowerCase(str.charAt(j))){
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))){
                System.out.println("Not Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}

