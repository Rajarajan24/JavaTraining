import java.util.*;
class RightRotate {
    public static  void main(String [] args) {
	int nums[] = {1, 3, 5, 7, 9};
	int k = 2;
        int n =nums.length;
        int []b = new int [n];
           for (int i = 0; i <n; i++) {
                b[((i + k)) % n]=nums[i];
        }
        for(int j=0;j<n;j++){
            nums[j]=b[j];
        }
	System.out.println(Arrays.toString(nums));
    }
}