//link - https://www.codingninjas.com/codestudio/problems/rotated-triangle_6573688?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=0

public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here

      
        for(int i = 1; i<=2*n - 1; i++){
           int stars = i;
           if(i>n){
               stars = 2*n-i;
           }
           for(int j = 1; j<=stars; j++ ){
               System.out.print("*");
           }
           System.out.println();
        }
    }
}
