package challenge;

public class TwoICodingChallenge
{
    public static void main(String[] args)
    {
        int[] arr = {1, 1, 10, 32, 41};
        int x = 42;
        PairSumCounter pairSumCounter = new PairSumCounter();
        int pairCount = pairSumCounter.countPairsWithSum(arr, x);
        System.out.println("Number of pairs with sum " + x + " is: " + pairCount);
    }
}
