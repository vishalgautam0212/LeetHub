class Solution {
    public int[] countBits(int n) {
        int[] op= new int[n+1];
        for(int i=1;i<op.length;i++){
            op[i]=op[i>>1]+i%2;
        }
        return op;
    }
}