//link = https://www.codingninjas.com/codestudio/problems/n-triangles_6573689?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=0

public class Solution {
    public static void nTriangle(int n) {
        // Write your code here
        for (int i = 1; i <=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
        System.out.println();
        }
    }
}
