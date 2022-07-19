import java.util.*;

public class Problem3{
    
    public static void main(String[] args)
    {
        ArrayList<Integer> ArrNum = new ArrayList<>(Arrays.asList(2,5,9,11));;
        int target = 11;

        System.out.println("Input : " + ArrNum + " target : " + target);
 
        for (int i = 0; i < ArrNum.size() - 1; i++)
        {
            for (int j = i + 1; j < ArrNum.size(); j++)
            {
                if (ArrNum.get(i) + ArrNum.get(j) == target)
                {
                    System.out.println("Output : [" + i + ", " + j + "]");
                    return;
                }
            }
        }
 
        System.out.println("Pair not found");
    }
    

}

