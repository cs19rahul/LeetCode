class Solution {
    public int candy(int[] rating) {
   /*     int[] toffees = new int[rating.length];
    if(rating[0]>rating[1])
            toffees[0]= 2;
    
    else toffees[0]=1;
        
        int max = 1;
        
        for(int i = 1;i<rating.length-1;i++){
            
          if(rating[i]>rating[i-1] || rating[i]>rating[i+1])
          {
              toffees[i]=  toffees[i-1]+1;
          }
            else {
                max = 0;
           
            toffees[i]=1;}
        }
        if(rating[rating.length-1]>rating[rating.length-2])
        {
           
           
            toffees[rating.length-1]= toffees[rating.length-2]+1;
            
        }
        else {toffees[rating.length-1]=1;} 
        
        int res = 0;
        
        for(int i = 0;i<toffees.length;i++)
        {
            res+=toffees[i];
        }
        
        for(int i :toffees){
            System.out.print(i+" ");}
        System.out.println();
     return res;  
    }*/
         int sum = 0;
        int[] left = new int[rating.length];
        int[] right = new int[rating.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for (int i = 1; i < rating.length; i++) {
            if (rating[i] > rating[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        for (int i = rating.length - 2; i >= 0; i--) {
            if (rating[i] > rating[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }
        for (int i = 0; i < rating.length; i++) {
            sum += Math.max(left[i], right[i]);
        }
        return sum;
    }}