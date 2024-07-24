package homeTasks.homeTask2;

public class DifferenceOfElements {
    public void difference(){
        int arr[] = new int[]{1, 2, 1, 4, 0};
        int littleNumber = arr[0];
        int largeNumber = arr[0];
        int even=0;
        int odd=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even += arr[i];
            } else if (arr[i] % 2 != 0) {
                odd += arr[i];
            }

        }
        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
        System.out.println("Difference : " + (even-odd));
    }
}
