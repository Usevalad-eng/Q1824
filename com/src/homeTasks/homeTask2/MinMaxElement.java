package homeTasks.homeTask2;

public class MinMaxElement {
    public void minMaxElement() {
        /*
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int max=arr[0];
        int min=arr[0];
        int sum=0;

        for (int i = 1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
            else if (arr[i]>max){
                max=arr[i];
            }



        }
        sum= max+min;
        System.out.println("min  "+min);
        System.out.println("max  "+min);
        System.out.println("sum=  "+sum);

         */
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
