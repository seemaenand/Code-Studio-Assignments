//link - https://www.codingninjas.com/codestudio/problems/star-triangle_6573671?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=1

public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here

        for(int i=0; i<n; i++){
            //spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //star
            for(int z=0; z<(2*i)+1; z++){
                System.out.print("*");
            }
        System.out.println();
        System.out.println();
        }
    }
}
