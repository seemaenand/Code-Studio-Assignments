//link - https://www.codingninjas.com/codestudio/problems/increasing-number-triangle_6581893?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here

        int count = 1;

        for (int i = 1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
