
public class MultidimenArr {
    public static void main(String[] args) {
        int[][] myNumbers={{1,2,3},{4,5,6},{7,8,9}};

        // System.out.println(myNumbers[0][0]);
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
