/*Given an array of integers, every element appears twice except for one. Find that single one.*/


public class Solution {
    public int singleNumber(int[] A) {
        int a = A.length;
        int total = 0;
        for (int i=0; i < a; i++){
            total = total ^ A[i];
        }
        
        return total;
    }
}
