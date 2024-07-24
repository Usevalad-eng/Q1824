package classTasks.lessonTwoAndTree;

public class LessonThree {
    public int array() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int sum=0;
        for (int i = 0;i<arr.length;i++){
        if (arr[i]%3==0){
            sum+=arr[i];
        }


    }
        return sum;

}
}
