// link - https://www.codingninjas.com/codestudio/problems/n-2-forest_6570178?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

public class Solution {
    public static void nForest(int n) {
        // Write your code here
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*" + " ");
            }
        System.out.println();
        System.out.println();
        }
    }
}


