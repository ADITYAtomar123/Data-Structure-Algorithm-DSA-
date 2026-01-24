package Binary;

public class LastOccurece {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5};
        int t=1;
        int l=0;
        int h =arr.length-1;
        int ans=-1;
        while(l<=h){
            int mid =(l+h)/2;
            if(arr[mid]>t) h = mid-1;
            else if(arr[mid]<t) l = mid+1;
            else{
                ans = mid;
                l = mid+1;
            }
        }
        System.out.println(ans);
    }
}
