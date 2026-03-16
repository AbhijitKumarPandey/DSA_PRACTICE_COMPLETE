package Array;

public class Second_DuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {23, 45, 65, 43, 45, 23};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; i < arr.length; i++) {
                if (arr[i] == arr[j]) {
                    count++;

                    if (count == 2) {
                        System.out.println("Second Duplicate Number is " + arr[i]);
                        return;
                    }
                   // break;
                }
            }
        }
    }
}
