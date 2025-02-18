public class Fibonacci {
    public static void main(String[] args) {
        long [] arr= new long[10001];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2;i <= 10000;i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[10000]);
        System.out.println(fibo(5));


    }
    static int fibo(int n ){
        if (n <2){
            return n;
        }
        int left = fibo(n-2);
        int right= fibo(n-1);
        return right+left;
//        return(fibo(n-1)+fibo(n-2));
    }
}
