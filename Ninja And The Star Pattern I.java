//link - https://www.codingninjas.com/codestudio/problems/ninja-and-the-star-pattern-i_6581920?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

public class Solution {
    public static void getStarPattern(int n) {
        // Write your code here

        //in this we are printing basically the borders

        for (int i=0; i<n; i++){
            //first and last row
            if (i==0 || i==n-1){
                for (int j=0; j<n; j++){
                    System.out.print("*" );
                }
            
            } else {
                for (int j=0; j<n; j++){
                    if(j==0 || j==n-1){
                        System.out.print("*" );
                    }else {
                        System.out.print("  ");
                    }
                
                }
            }
        System.out.println();
        }
    }
}
