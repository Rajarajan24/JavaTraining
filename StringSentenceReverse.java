public class StringSentenceReverse {


        public static void main(String[] args) {
            String str = "I love   Java";
            System.out.println("Given : " + str);
            String [] st = str.split(" ");
            int n =st.length;
            StringBuilder sb = new StringBuilder();
            for(int i =n-1; i>=0; i--) {
                sb.append(st[i]);
                sb.append(" ");
            }
            System.out.println("After reversed : " + sb);
            int m = sb.length();
            for (int j = 0; j < m - 1; j++) {
                if (sb.charAt(j) == ' ' && sb.charAt(j + 1) == ' ') {
                    sb.deleteCharAt(j + 1);
                    j--;
                    m--;
                }
            }
            System.out.println( "After Trimmed extra space : " + sb);
        }

}
