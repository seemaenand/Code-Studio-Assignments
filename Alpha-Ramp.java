//link - https://www.codingninjas.com/codestudio/problems/alpha-ramp_6581888?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=0

public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here

        char ch = 'A';
        for(int i= 1; i<=n;  i++){
            for(int j = 1; j<=i; j++){
                System.out.print(ch + " ");
                
            }
            ch++;
            System.out.println();
        }
    }
}

    

