package Array;

public class First_Duplicate_Number {
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,8,2,3,4,};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("First Duplicate Number is " + arr[i]);
                    return;

                }
            }
        }

    }
}
