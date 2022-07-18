import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input : ");
        int varInput = input.nextInt();
        input.close();
        
        for (int i = 1; i <= varInput; i++){
           for (int j = varInput - 1; j >= i; j--) {
               System.out.print(' ');
           }
           for (int k = 1; k <= i; k++){
               System.out.print('*');
           }
           for (int l = 1; l <= i - 1; l++){
               System.out.print('*');
           }
           System.out.println();
        }
    }
    

}