/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 16/11/21
 *   Time: 2:25 PM
 *   File: knapsack.java
 */

import java.util.Arrays;

public class knapsack {
    public static void main(String[] args) {
        final int CAPACITY = 60;
        int[] weight = new int[]{5, 10, 20, 30, 40};
        int[] profit = new int[]{30, 20, 100, 90, 160};
        float[] ratio = new float[profit.length];
        for (int i = 0; i < profit.length; i++) {
            ratio[i] = (float)profit[i] / (float)weight[i];
        }
        Arrays.sort(ratio);
        int sum = 0;
        float[] x = new float[profit.length];
        for (int i = 0; i < profit.length; i++) {
            while (sum < CAPACITY) {
                sum += ratio[i];
                x[i] = 0;
                i++;
            }
            x[--i] = (CAPACITY - (sum - x[i - 1])) / ratio[i + 1];
            for (int j = i + 1; j < profit.length ; j++) {
                x[j] = 0;
            }
            System.out.println(x[i]);
        }
    }
}
