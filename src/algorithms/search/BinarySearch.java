package algorithms.search;

public class BinarySearch {
	 public static int search(int[] nums, int target) {
	        int h = nums.length -1;
	        int l = 0;
	        int mid = 0;
	        while(h>=l)
	        {
	        	//count++;
	            mid = l + (h -l)/2;
	            if(nums[mid]==target)
	            {
	                return mid;
	            }
	            else if (target > nums[mid])
	            {
	                l = mid + 1;
	            }
	            else
	            {
	                h = mid - 1;
	            }
	            
	        }
	        return -1;
	    }

	public static void main(String[] args) {
		System.out.println(BinarySearch.search(new int[] {1,2,3,45},3));
	}

}

