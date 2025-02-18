public class StarName {
    public static void main(String[] args) {
        StarName chr= new StarName();
       chr.chR();
    }
    void chR() {
        String[][] str = {
                {"*", "*", "*","  "," ","*"," ","  ","*","*","*","*","*"},
                {"*", " ", "*","  ","*"," ","*","  "," "," ","*", " "," "},
                {"*", "*", "*","  ","*","*","*","  "," "," ","*"," "," "},
                {"*", "*", " ","  ","*"," ","*","  ","*"," ","*"," "," "},
                {"*", " ", "*","  ","*"," ","*","  ","*","*","*"," "," "}
        };
        int n = str.length;
        int m = str[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }
    void chA() {
        String[][] str = {
                {"*", "*", "*"},
                {"*", " ", "*"},
                {"*", "*", "*"},
                {"*", " ", "*"},
                {"*", " ", "*"}
        };
        int n = str.length;
        int m = str[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }
    void chJ() {
        String[][] str = {
                {"*", "*", "*"},
                {" ", " ", "*"},
                {" ", " ", "*"},
                {"*", " ", "*"},
                {"*", "*", "*"}
        };
        int n = str.length;
        int m = str[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }

}
