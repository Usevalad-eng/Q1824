package homeTasks.homeTask2;

public class MinMaxElement {
    public void minMaxElement() {

        int arr[] = new int[]{98, 2, 71, 1, 40, 9, 5};
        int littleNumber = arr[0];
        int largeNumber = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largeNumber) {
                largeNumber = arr[i];
            } else if (arr[i] < littleNumber) {
                littleNumber = arr[i];
            }
        }
        System.out.println("Maxinum : " + largeNumber);
        System.out.println("Minimum : " + littleNumber);
        System.out.println("Summa : " + (littleNumber + largeNumber));
    }
}
