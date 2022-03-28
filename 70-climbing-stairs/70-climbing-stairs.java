class Solution {
    public int climbStairs(int n) {
        int[] op= new int[n+1];
        op[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                op[i]= op[i-1];
            }
            else{
                op[i]= op[i-1] + op[i-2];
            }
            }
        return op[n];
        }
        
    }
