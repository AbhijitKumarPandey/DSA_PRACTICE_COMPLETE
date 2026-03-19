package String_Two_Pointer;

public class FirstNonRepitngNumber {
    public static void main(String[] args) {
        String str = "aabbcaabbde";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int count = 0;

            //inner loop -> count occurrences
            for(int j=0; j < str.length(); j++){
                if(ch==str.charAt(j)){
                    count++;

                }
            }
            if(count==1){
                System.out.println("First Non-Repeating Character = " + ch);
                break;
            }
        }

    }
}
