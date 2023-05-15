// link - https://www.codingninjas.com/codestudio/problems/reverse-number-triangle_6581889?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=0

public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for (int i = 1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
        System.out.println();
        System.out.println();
        }
    }
}
