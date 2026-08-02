import java.util.Arrays;

public class LeftRotate {
     static void lreverse(int arr[] ,int st ,int end) {
         while (st <= end) {
             int temp = arr[st];
             arr[st] = arr[end];
             arr[end] = temp;
             st++;
             end--;
         }
     }
        public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7};
        int d =3;
        reverse(arr,0,d-1);
        reverse(arr,d, arr.length-1);
        reverse(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
