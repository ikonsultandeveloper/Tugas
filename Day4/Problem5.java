import java.util.*;

public class Problem5{
    
    public static void main(String[] args)
    {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(2, 3, 3, 3, 6, 9, 9));

        HashSet<Integer> result = new HashSet<Integer>(array1);

        System.out.println("Input : " + array1) ;
 
        System.out.println("Output : " + result.size());
    }
    
}

