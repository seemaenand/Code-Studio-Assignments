// link - https://www.codingninjas.com/codestudio/problems/seeding_6581892?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=0


public class Solution {
    public static void seeding(int n) {
        // Write your code here
        for (int i=0; i<n; i++){
            for (int j=0; j<n-i; j++){
                System.out.print("*" + " ");
            }
        System.out.println();
        System.out.println();
        }
    }
}
