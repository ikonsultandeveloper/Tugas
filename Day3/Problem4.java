import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input number: ");
        int varInput = input.nextInt();
        input.close();
        
        int cnt = 0;
        
        for (int i = 2; i <= varInput; i++){
            if (varInput % i == 0){
                cnt++;
            } 
        }
        
        if (cnt == 1){
            System.out.println("Output: Bilangan Prima");
        } else {
            System.out.println("Output: Bukan Bilangan Prima");
        } 
    }
}