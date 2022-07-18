import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input x or o: ");
        String varInput = input.nextLine();
        input.close();

        int x = 0, o = 0;
        varInput = varInput.toLowerCase();
        if (varInput.contains("x") || varInput.contains("o") || varInput.contains("xo")) {
            for (int i = 0; i < varInput.length(); ++i) {
                char ch = varInput.charAt(i);

                if (ch == 'x') {
                    x++;
                }

                else if (ch == 'o') {
                    o++;
                }              
            }

            boolean varReturn = false;
            if (x == o) {
                varReturn = true;
            }

            System.out.println(varReturn);
        } else {
            System.out.println("Input must be contain x or o");
        }
    }
}