//link - https://www.codingninjas.com/codestudio/problems/reverse-letter-triangle_6581906?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=0

public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here

         for(int i= 1; i<=n;  i++){
            for(char ch='A'; ch <='A' + n - i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}


    

