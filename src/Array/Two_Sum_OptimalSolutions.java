package Array;

public class Two_Sum_OptimalSolutions {
    public static void main(String[] args) {
        int arr[] = {7,11,15,2};
        int target = 9;

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int sum = arr[left]+arr[right];

            if(sum==target){
                System.out.println("Index is = " + left + " " + right);
                break;
            }
            else if(sum<target){
                left++;
            }else {
                right--;
            }
        }
    }
}
