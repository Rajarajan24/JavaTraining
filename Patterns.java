import java.util.Scanner;

public class Patterns {
     void pattern1(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
     void pattern2(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     void pattern3(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
     void pattern4(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }
     void pattern5(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    void pattern7(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for (int j =1; j <= (2*n)-(2*i) ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j-- ) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void pattern8(int n){
        int num=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    void pattern9(int n ){
        for (int i = 1; i <=n ; i++) {
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    void pattern10(int n ){
        for (int i = 1; i <=n ; i++) {
            for(char ch='A';ch<=(n-i)+'A';ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    void pattern11(int n ){
        for(int i =0;i< n ;i++){
            for(char ch= 'A'; ch<='A'+i;ch++){
                System.out.print((char)('A'+i));
            }
            System.out.println();
        }
    }
    void pattern12(int n ){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-i)-1 ; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int point = ((2*i)+1) / 2;
            for (int j = 0; j <(2*i)+1 ; j++) {
                System.out.print(ch);
                if(j<= point){
                    ch++;
                }else{
                    ch--;
                }
            }
            for (int j = 0; j < (n-i)-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void pattern13(int n ){
        for (int i = 0; i < n ; i++) {
            for (char ch = (char) ('E'-i); ch<='E'; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
    void pattern14(int n){
         int space =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n -i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(n-i) ; j++) {
                System.out.print("*");
            }
            space = space +2;
            System.out.println();
        }
        int inSpace =8;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < inSpace ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            inSpace = inSpace -2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Patterns pattern = new Patterns();

        pattern.pattern14(5);
    }
}



