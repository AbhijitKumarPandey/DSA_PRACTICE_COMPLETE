package Array;

import java.util.HashMap;

public class Two_Sum_Better_Approch_Hash {
    public static void main(String[] args) {
        int arr[] = {7,2,11,15};
        int target = 9;
        HashMap<Integer, Integer> MAP = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int remaining = target-arr[i];

            if(MAP.containsKey(remaining)){
                System.out.println(MAP.get(remaining)+ " " + i);
            }
            MAP.put(arr[i],i);

        }
    }
}
