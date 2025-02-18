import java.util.Scanner;

class ArrayEx {
    public static void main(String[]s){
        // Scanner sc = new Scanner(System.in);
        // int el = sc.nextInt();
        // int []arr = new int [el];
        // int n = arr.length;
        // for(int i =0;i<el;i++){
        //     arr[i]=sc.nextInt();
        // }
        int []arr = {1,2,3,4,5};
        int n = arr.length;

        
        for (int i= 0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i = n-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int e:arr){
            e++;
            System.out.print(e);
        }
        System.out.println();
        for(int e : arr){
            System.out.print(e);
        }
        System.out.println();
        int maxi = arr[0];
        int maxi2=Integer.MIN_VALUE;
        for(int i =1;i<n;i++){
            if(arr[i]>maxi){
                 maxi = arr[i];
            }
        }
            for(int i =1;i<n;i++){
                if(arr[i]>maxi2 && arr[i]!=maxi){
                     maxi2 = arr[i];
                }
        }

        System.out.println(maxi);
        System.out.println(maxi2);
    
    }
}