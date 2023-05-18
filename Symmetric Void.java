//link - https://www.codingninjas.com/codestudio/problems/symmetric-void_6581919?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems



public class Solution {
    public static void symmetry(int n) {
        // Write your code here

        //top half
        for(int i = 0; i<n; i++){
            //stars
            for(int j=0; j<n-i; j++){
                System.out.print("*" + " ");
            }
            //spaces
            for(int j=0; j<2*i; j++){
                System.out.print("  ");
            }

            //stars
            for(int j=0; j<n-i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        //bottom half
        for(int i = 1; i<=n; i++){
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*"+" ");
            }

            //spaces
            for(int j = 1; j<n-i; j++){
                System.out.print("  ");
            }

            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();

    }
}
}
