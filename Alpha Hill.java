//link - https://www.codingninjas.com/codestudio/problems/alpha-hill_6581921?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=0

public class Solution {
    public static void alphaHill(int n) {
        // Write your code here

        for (int i=0; i<n; i++){
            //spaces
            for (int j=0; j<n-i-1; j++){
                System.out.print("  ");
            }

            //left alpha
            char ch = 'A';
            int breakpoint = ((2*i)+1)/2;
            for(int j = 1; j<= 2*i+1; j++){
                System.out.print(ch + " ");
                if (j<=breakpoint){
                ch++;
                } else{
                ch--;
                }
            }

            
            System.out.println();
        
        }
    }
}
