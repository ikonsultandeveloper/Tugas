import java.util.*;

public class Problem1{
    
    public static void main(String[] args)
    {
        ArrayList<String> array1 = new ArrayList<String>();
        ArrayList<String> array2 = new ArrayList<String>();
        array1.add("kazuya");
        array1.add("jin");
        array1.add("lee");
        array2.add("kazuya");
        array2.add("feng");

        System.out.println("Input : " + array1 + array2);
        
        array1.addAll(array2);

        HashSet<String> array3 = new HashSet<String>(array1);

        System.out.println("Output : " + array3);
        
    }

}