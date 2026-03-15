package Array;

public class Sum_Elements {
    public static void main(String[] args) {
        int arr[] = {10,5,2,4};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum of Digits = " + sum);

    }
}
