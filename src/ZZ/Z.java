package ZZ;

public class Z {
    public int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int res;
        int temp = nums[0];
        for(int x = 1; x < nums.length ;x++){
            if(nums[x] < temp) {
                temp = x;
                break;
            }
        }
        int[] q = {1,2};
        q = new int[]{2, 2};

        // x 此时是分界点的下标
        int left = binarySearch(0,temp-1,nums,target);
        if(left != -1) return left;
        int right = binarySearch(temp,nums.length-1,nums,target);
        if(right != -1) return right;
        return -1;
    }
    public int binarySearch(int lo,int hi,int[] nums,int target){

        if( lo > hi) return -1;
        int mid = lo + (hi - lo)/2;
        if(nums[mid] == target) return mid;
        if(nums[mid] < target) {
            return binarySearch(mid + 1,hi,nums,target);
        }
        else
            return binarySearch(lo, mid - 1,nums,target);
    }
    public static void main(String[] args){
        int[] nums = {7,9,1,4,6};
        Z z = new Z();
        int i = z.search(nums, 5);
        System.out.print(i);
    }


}
