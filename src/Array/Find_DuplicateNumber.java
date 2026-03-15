package Array;

public class Find_DuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {6,7,8,9,4,5,6};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Number is " + arr[i]);
                }
            }
        }
    }
}
