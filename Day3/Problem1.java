import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input your words: ");
        String varInput = input.nextLine();
        input.close();
        
        int vocals = 0, consonants = 0, digits = 0, characters = 0;
        varInput = varInput.toLowerCase();
        for (int i = 0; i < varInput.length(); ++i) {
            char ch = varInput.charAt(i);

            // check if character is any of a, e, i, o, u
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vocals;
            }

            // check if character is in between a to z
            else if ((ch >= 'a' && ch <= 'z')) {
                 ++consonants;
            }
                

            // check if character is space
            else if (ch == ' ') {
                characters++;
            }
        }

        int totalChar = varInput.length() - characters;
        System.out.println("Jumlah Vokal: " + vocals);
        System.out.println("Jumlah Konsonan: " + consonants);
        System.out.println("Total Karakter: " + totalChar);
    }
}