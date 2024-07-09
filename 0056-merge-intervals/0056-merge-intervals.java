class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        // sort the interval by 1st entry.
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
//         int[][] ansToReturn = new int[ans.size()][2];

//         for(int k=0;k<ans.size();k++){
//             ansToReturn[k][0] = ans.get(k).get(0);
//             ansToReturn[k][1] = ans.get(k).get(1);
//         }
//         return ansToReturn;
        
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            // skip the inter which is alredy exist in the list
            
            if(!ans.isEmpty() && end<=ans.get(ans.size()-1).get(1)){
                continue;
            }
            
            for(int j=i+1;j<n;j++){
                if(intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                }
                else
                    break;
            }
            
            ans.add(Arrays.asList(start,end));
            
        }
        int[][] arr=new int[ans.size()][2];
        for(int k=0;k<ans.size();k++){
            arr[k][0]=ans.get(k).get(0);
            arr[k][1]=ans.get(k).get(1);
        }
        return arr;
    }
}