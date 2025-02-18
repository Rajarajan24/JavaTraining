public class CountFreq {
    public static void main(String[] args) {
        int []arr={3,2,3,1,2,9};
        int n =arr.length;
        for (int i = 0; i <n; i++) {
            int cnt =1;
            for (int j =i+1; j <n ; j++) {
                if(arr[i]==arr[j]){
                    cnt++;
                    arr[j]=-1;
                }

            }
            if (arr[i]!=-1) {
                System.out.println(arr[i]+"-"+ cnt);
            }

        }
    }
}
