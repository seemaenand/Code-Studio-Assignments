//link - https://www.codingninjas.com/codestudio/problems/alpha-triangle_6581429?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here

        char startAlpha = (char)(int)('A' + n - 1);

        for(int i=0; i<n; i++){
            for (char j = startAlpha; j>=(char)(int)(startAlpha - i); j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
