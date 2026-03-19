package String_Two_Pointer;

public class CountVowels {
    public static void main(String[] args) {
        String str = "abhijit";
        int vowels = 0;
        int consonant = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;

            }else{
                consonant++;
            }
        }
        System.out.println("Volwels = " + vowels);
        System.out.println("Consonant = " + consonant);
    }
}
