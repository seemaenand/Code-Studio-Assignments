// link - https://www.codingninjas.com/codestudio/problems/reverse-star-triangle_6573685?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=0

public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        
        for(int i=0; i<n; i++){
            //spaces
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0; j<2*n-(2*i+1); j++){
                System.out.print("*" );
            }
        System.out.println();
        System.out.println();
    }
}
}
    
