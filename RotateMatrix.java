import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int [][] mat= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = mat.length;
        for (int i = 0; i < n-2; i++) {
            for (int j = i; j <n-1 ; j++) {
                int temp = mat[i][j];
                mat[i][j]= mat[j][i];
                mat[j][i]= temp;
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n/2; j++) {
                int temp = 0;
                temp = mat[i][j];
                mat[i][j] = mat[i][(n- 1) - j];
                mat[i][(n - 1) - j] = temp;
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
