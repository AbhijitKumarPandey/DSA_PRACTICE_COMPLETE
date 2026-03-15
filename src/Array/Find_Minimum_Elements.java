package Array;

public class Find_Minimum_Elements {
    public static void main(String[] args) {
        int arr[] = {23,56,78,98,65,43,12};
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Elements is " + min);
    }
}
