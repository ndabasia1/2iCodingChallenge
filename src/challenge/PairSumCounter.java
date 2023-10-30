package challenge;

import java.util.HashSet;

public class PairSumCounter
{
    public int countPairsWithSum(int[] numbers, int x)
    {
        //Initialise the count variable and create a hashset in order to disallow duplicate elements.
        int count = 0;
        HashSet<Integer> usedNumbers = new HashSet<>();
        
        //Loop through the numbers array. For each element, it will minus that from the sum total and then it will check if usedNumbers contains the remaining value needed to complete the sum. At the start, it will be empty and so it will go straight to the else statement
        for (int num : numbers)
        {
            int remainingValueToSum = x - num;
            if (usedNumbers.contains(remainingValueToSum))
            {
                count++;
                usedNumbers.remove(remainingValueToSum); // Ensuring each number is used only once
            }
            else
            {
                usedNumbers.add(num);
            }
        }
        return count;
    }
}
