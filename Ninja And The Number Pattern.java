//link - https://www.codingninjas.com/codestudio/problems/ninja-and-the-number-pattern-i_6581959?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTab=0

public class Solution {
    public static void getNumberPattern(int n) {
        // Write your code here.// Pattern Size
        int size = 2 * n - 1;
        int front = 0;
        int back = size - 1;
        int a[][] = new int[size][size];
        while (n != 0) {
            for (int i = front; i <= back; i++) {
                for (int j = front; j <= back;
                                        j++) {
                    if (i == front || i == back ||
                         j == front || j == back)
                        a[i][j] = n;
                }
            }
            ++front;
            --back;
            --n;
        }
        print(a, size);
    }
 
    // function to Print pattern
    public static void print(int a[][], int size)
    {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

}

