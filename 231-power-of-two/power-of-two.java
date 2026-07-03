class Solution {
    public boolean isPowerOfTwo(int n) {
         return n > 0 && (n & (n - 1)) == 0; //16 ki 1000 and 15 ki 1110 == 1000
    }
}