package Array;

public class Search_InElements {
    public static void main(String[] args) {
        int arr[] = {23, 45, 67, 89, 32};

        int target = 67;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Elements Found is Index = " + i);
                found = true;
                break;
            }
        }
        if (found==false) {
            System.out.println("Elements is not Found ");
        }
    }
}
