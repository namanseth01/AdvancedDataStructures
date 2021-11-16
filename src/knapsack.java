/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 16/11/21
 *   Time: 2:25 PM
 *   File: knapsack.java
 */

import java.util.Arrays;

public class knapsack {
    public static void main(String[] args) {
        int[] weight = new int[]{5, 10, 20, 30, 40};
        int[] profit = new int[]{30, 20, 100, 90, 160};
        float[] ratio = new float[profit.length];
        for (int i = 0; i < profit.length; i++) {
            ratio[i] = (float)profit[i] / (float)weight[i];
        }
        Arrays.sort(ratio);
        float[] x = new float[profit.length];

    }
}
