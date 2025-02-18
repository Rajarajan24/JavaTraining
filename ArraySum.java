import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int []arr = {5,1,3};
        int []b = {9,7,7,7};
        int []c= new int[4];
        int sum= 0;
        int i=0;
        while(i<c.length) {
            if(i<arr.length){
                c[i] += arr[i] ;
            }
            if(i<b.length){
                c[i]+= b[i];
            }
            c[i] = c[i] + sum;
            if (c[i] >= 10) {
                sum = c[i] / 10;
                c[i] = c[i] % 10;
            } else {
                sum = 0;
            }
            i++;

        }
        for(int e :c){
            System.out.print(e + " ");
        }
    }
}

