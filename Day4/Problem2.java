import java.util.*;

public class Problem2{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);  
        System.out.print("Input : ");
        String varInput = input.nextLine();
        input.close();

        ArrayList<Integer> arrInt = new ArrayList<Integer>();

        char[] chars = varInput.toCharArray();
        for (char c : chars)
        {
            String strChar = String.valueOf(c);
            arrInt.add(Integer.parseInt(strChar));
        }

        HashSet<Integer> distinct = new HashSet<Integer>(arrInt);
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (Integer i : distinct)
        {
            int count = Collections.frequency(arrInt, i);

            if(count == 1)
            {
                result.add(i);
            }
        }
        
        System.out.println("Output : " + result);
        
    }

}