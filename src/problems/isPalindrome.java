class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        int y = 0;
        int tmp = x;
        while (x != 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return (tmp == y);
    }
}

