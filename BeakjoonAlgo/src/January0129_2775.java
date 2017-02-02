import java.util.Scanner;
public class January0129_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 0;
        int n = 0;
        int[][] building = new int[15][15];
        for(int i=0; i<15; i++) {
            building[0][i] = i;
        }
        for(int row=1; row<15;row++) {
            for(int col = 0; col<15; col++) {
                int temp = 0;
                for(int col2 = 0; col2<=col; col2++)
                    temp +=building[row-1][col2];
                building[row][col] = temp;
            }
        }
        
        for(int i=0; i<t; i++) {
            k = sc.nextInt();
            n = sc.nextInt();
            System.out.println(building[k][n]);
        }
    }
}