import java.util.*;

public class Problem4{
    
    public static void main(String[] args)
    {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1,2,3,4));

        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1,3,5,10,16));

        ArrayList<Integer> result = new ArrayList<Integer>();

        System.out.println("Input : " + array1 + " dan " + array2);
 
        for (int i = 0; i <= array1.size() - 1; i++)
        {
            if(!array2.contains(array1.get(i)))
                result.add(array1.get(i));
        }

        System.out.println("Output : " + result);
    }
    
}

