//link - https://www.codingninjas.com/codestudio/problems/number-crown_6581894?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=0

public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i = 1; i<=n; i++){
            //left half numbers
            for(int j= 1; j<=i; j++){
                System.out.print(j+" ");
            }

            //spaces
            for (int j=1; j<=2*n-2*i; j++){
                System.out.print("  ");
            }

            //right half numbers
            for (int j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
