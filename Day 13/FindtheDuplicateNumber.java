
public class FindtheDuplicateNumber {
    public int fid(int [] arr){
        int low=0; int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            int cnt=0;
            for(int val:arr){
                if(val<=mid){
                    cnt++;
                }
            }
            if(cnt>mid){
                high=mid;
            }else{low=mid+1;}
        }
        return low;
    }
    
}
