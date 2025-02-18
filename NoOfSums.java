import java.util.Scanner;
public class NoOfSums {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int len = in.nextInt();
        int sum=0;
        int preSum = n;
        for(int i =0;i<len;i++){
            sum= sum +(preSum);
            preSum = (preSum*10)+n;
        }
        System.out.println(sum);
    }
}
