//link - https://www.codingninjas.com/codestudio/problems/star-diamond_6573686?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=0

public class Solution {
    public static void nStarDiamond(int n) {
        // Write your code here
        
        //top half

        for(int i = 0; i<n; i++){
            //spaces
            for(int j= 0; j< n-i-1; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 0; j<(2*i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //bottom half
        for(int l = 0; l<n; l++){
            //spaces
            for(int j = 0; j<l; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0; j< (2*n-2*l)-1 ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
