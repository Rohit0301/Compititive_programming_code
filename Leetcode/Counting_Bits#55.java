class Solution {
    public int[] countBits(int n) {
        int a[] = new int[n+1];
        for(int i=1;i<=n;i++)
            a[i] = a[i>>1] + i%2;
        return a;
    }
}
