import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input number: ");
        int varInput = input.nextInt();
        input.close();
        
        System.out.println("Output :");
        int factor = 0;
        for (int i = 0; i <= varInput; i++) {
            factor++;
            if (varInput % factor == 0) {
                System.out.print(factor + "\r\n");
            }
        }
    }
}