//link - https://www.codingninjas.com/codestudio/problems/binary-number-triangle_6581890?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=0

public class Solution {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        int start = 1;
        for (int i=1; i<=n; i++){
            if(i%2 == 0){
                start = 0;
            } else {
                start = 1;
            }
            for (int j = 1; j<=i; j++){
                System.out.print(start+" ");
                start = 1 - start; 
            }
            System.out.println();
        }

    }
}
