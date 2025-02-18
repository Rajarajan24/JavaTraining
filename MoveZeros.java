import java.util.Arrays;
public class MoveZeros {

    //    public static void main(String[] args){
//        int [] nums= {1,0,0,2,39};
//        int j = 0;
//        int n = nums.length;
//        for(int i = 0;i < n;i++){
//            if(nums[i] != 0){
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        while(j < n){
//            nums[j] = 0;
//            j++;
//        }
//        System.out.println(Arrays.toString(nums));
//
//    }
    public static void main(String[] args) {
        int []arr= {1,1,0,1,1,0,1,1,0,1};
        int n =arr.length;
        int []temp= new int [n];
        int j=0;
        for(int i =0;i<n;i++){
            if(arr[i]>0){
                temp[j]=arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(temp));
    }

    }


