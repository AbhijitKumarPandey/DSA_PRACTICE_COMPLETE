package Array;

public class Count_EvenNumber {
    public static void main(String[] args) {
        int arr[] = {23,45,87,90,57,22,20};
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                count = count+1;
            }
        }
        System.out.println("Even Number is Count " + count);
    }
}
