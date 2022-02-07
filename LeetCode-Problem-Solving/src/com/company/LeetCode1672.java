package com.company;

class LeetCode1672 {
    public int maximumWealth(int[][] accounts) {
        int wealth = -1;

        for(int i=0; i<accounts.length; i++){
            int tempSum = -1;

            for(int j = 0; j<accounts.length; j++){
                tempSum += accounts[i][j];
            }

            if(tempSum > wealth){
                wealth = tempSum;
            }
        }

        return wealth;
    }
}
