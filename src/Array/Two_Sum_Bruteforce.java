package Array;

public class Two_Sum_Bruteforce {
    public static void main(String[] args) {
        int arr[] = {7,2,11,15};
        int target = 9;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i + " " + j);

                }
            }
        }
    }
}
