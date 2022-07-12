class Solution {
    public boolean makesquare(int[] matchsticks) {
         int[] arr = new int[4];
        int sum = 0;
        for(int i : matchsticks)sum+=i;
        if(sum%4!=0)return false;
        Arrays.sort(matchsticks);
        return square(matchsticks, arr,  matchsticks.length - 1, sum/4);
    }
    public boolean square(int[] matchstick, int[] arr, int idx, int sum){
        if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3] && arr[3]==sum)return true;
        if(arr[0]>sum || arr[1]>sum || arr[2]>sum || arr[3]>sum)return false;
        
        int x = matchstick[idx];
        for(int i=0;i<4;i++){
            arr[i] += x;
            boolean y = square(matchstick, arr, idx-1, sum);
            if(y)return true;
            arr[i] -= x;
        }
        return false;
    }
    }
