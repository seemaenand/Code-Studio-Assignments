//link - https://www.codingninjas.com/codestudio/problems/symmetry_6581914?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

public class Solution {
    public static void symmetry(int n) {
        // Write your code here

        //top
        for(int i = 0; i<n; i++){
            //left stars
            for(int j=0; j<=i; j++){
                System.out.print("*"+" ");
            }
            
            //spaces
            for(int j=0; j<n-i; j++){
                System.out.print("  ");
            }

            //right stars
            for(int j=0; j<=i; j++){
                System.out.print("*"+" ");
            }
             System.out.println();
             
        }

        //bottom
        for(int i = 1; i <= n-1; i++){
            //left stars
            for(int j=1; j<=n-i; j++){
                 System.out.print("*"+" ");
            }
            //spaces
            for(int j=1; j<=2*i; j++){
                System.out.print("  ");
            }
            //right stars
            for(int j=1; j<=n-i; j++){
                 System.out.print("*"+" ");
            }
             System.out.println();
        }
       
       
    }
}
