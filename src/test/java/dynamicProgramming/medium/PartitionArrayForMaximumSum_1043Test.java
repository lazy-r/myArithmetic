package dynamicProgramming.medium;

import static org.junit.Assert.*;

public class PartitionArrayForMaximumSum_1043Test {

    @org.junit.Test
    public void maxSumAfterPartitioning() {
        int[] arr = new int[]{1,15,7,9,2,5,10};
        System.out.println(new PartitionArrayForMaximumSum_1043().maxSumAfterPartitioning(arr, 3));
    }
}
