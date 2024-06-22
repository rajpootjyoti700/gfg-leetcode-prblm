class Solution {

    public int numberOfSubarrays(int[] nums, int k) {
        
        return atmost(nums,k)-atmost(nums,k-1);
    
    }
    int atmost(int[] nums, int k){
        int i=0;
        int j=0;
        int ans=0;
        while(j<nums.length){
            if(nums[j]%2==1){
                if(k>0)
                    k--;
                    else{
                        while(nums[i]%2!=1)i++;
                            i++;
                    }
                  
                  }
            j++;
            ans=ans+(j-i+1);
            }
        return ans;
    
              
        }
            
    }

