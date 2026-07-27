import java.util.Scanner;
class GeneratePrimes {
    public static  void main(String a[]) { 
	Scanner in = new Scanner(System.in);
 	 System.out.println("Enter number >= 2 : ");

	int n = in .nextInt();
      int[] prime = new int[n];
        for (int i = 2; i < n; i++) {
            prime[i] = 1;
        }
        for (int i = 2; i * i < n; i++) {
          if (prime[i] == 1) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = 0;
                }
            }
        }
     int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i] == 1) {
                System.out.println(i);
            }
        }
          }
}