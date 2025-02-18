public class FindMin {
    public static void main(String [] args){
        int [] arr={ 93,43,45,32,23,12,21,13,16,83,86};
        System.out.println(min(arr));

    }
    public static int min(int []arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    }


