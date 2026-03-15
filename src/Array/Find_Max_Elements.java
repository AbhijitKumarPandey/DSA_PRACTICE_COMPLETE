package Array;

public class Find_Max_Elements {
    public static void main(String[] args) {
        int arr[] = {23,45,67,98,76};
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
            System.out.println("Maximum Elements is " + max);
        }
    }

