//link - https://www.codingninjas.com/codestudio/problems/increasing-letter-triangle_6581897?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i= 0; i<n;  i++){
            for(char ch='A'; ch <='A' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

