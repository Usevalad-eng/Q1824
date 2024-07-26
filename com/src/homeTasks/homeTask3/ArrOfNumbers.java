package homeTasks.homeTask3;

import java.util.Arrays;

public class ArrOfNumbers {
    int arr[] = new int[]{98, 2, 71, 1, 40, 9, 5};
    int key = 9;//element to find;
    private String minMaxElement() {
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
        return null;
    }
    private String sortArray(){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return null;
    }
    public String getArr(){
        return minMaxElement();
    }
    public String getsortedArray(){
        return sortArray();
    }
    private String getIndex(){
        int index = Arrays.binarySearch(arr, key);
        System.out.println(index);
        return null;
    }
    public String getIndexOfElement(){
        return getIndex();
    }

}
