import java.util.Scanner;

public class FindPrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        boolean stop = false;
//        while(!stop) {
            int num = 8;
            if (isPrime(num)) {
                System.out.println(num + " is Prime");
//                stop = true;
            } else {
                System.out.println(num + " is not a Prime");
            }
//        }
        byte b =(byte) 1890000;
        System.out.println(b);

    }
    public static boolean isPrime(int num){
        if(num % 2 == 0){
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public void check(){
       boolean res = isPrime(5);
    }
}
