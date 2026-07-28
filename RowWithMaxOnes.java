public class RowWithMaxOnes {
    public static int max(int []arr) {
        int ans = arr[0];
 for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
               return i;            }
        }
        return ans;
    }
 public static void main(String[] args) {
        int mat [][] = {{0,0,0,1},{1,0,1,0},{1,1,1,0}};
        int n = mat.length;
        int m = mat[0].length;
        int [] ans = new int [n];
        int k =0;
        
for (int i = 0; i <n ; i++) {
            int cnt =0;
            for (int j = 0; j <m ; j++) {
                if(mat[i][j] == 1){
                    cnt++;
                }
                ans[k] = cnt;
            }
        }
        int maxi = max(ans);
	if(maxi ==0)  System.out.println(-1);
        System.out.println(maxi);
    }
}
