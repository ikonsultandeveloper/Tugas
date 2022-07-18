import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input your words: ");
        String varInput = input.nextLine();
        input.close();

        String reversevarInput = "";
        varInput = varInput.toLowerCase();
        for (int i = (varInput.length() - 1); i >= 0; i--) {
            reversevarInput = reversevarInput + varInput.charAt(i);
        }

        if (varInput.equals(reversevarInput.toLowerCase())) {
            System.out.println("Output: katakPalindrome");
        } else {
            System.out.println("Output: Bukan Palindrome");
        }
    }
}