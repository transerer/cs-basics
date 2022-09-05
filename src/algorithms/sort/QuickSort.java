package algorithms.sort;

import java.util.Arrays;

/***
 * 
 * @author Satish Singh
 * 
  partition (arr[], low, high)
	{
	     pivot (Element to be placed at right position)
	    pivot = arr[high];  
	 
	    i = (low - 1)   Index of smaller element and indicates the 
	                    right position of pivot found so far
	
	    for (j = low; j <= high- 1; j++)
	    {
	         If current element is smaller than the pivot
	        if (arr[j] < pivot)
	        {
	            i++;     increment index of smaller element
	            swap arr[i] and arr[j]
	        }
	    }
	    swap arr[i + 1] and arr[high])
	    return (i + 1)
	}
 */
public class QuickSort {
	
	public  void quick(int a[] , int low , int high) {
		
		if(low<high) {
			int pi = partition(a,low,high);
			
			quick(a,low,pi -1);
			quick(a,pi+1,high);
		}
	}
	
	public  int partition(int a[] , int low , int high)
	{
		int pivot = a[high];
		int i = low -1;
		
		for(int j=low;j<high;j++) {
			if(a[j]<pivot) {
				i++;
				swap(a,i,j);
			}
		}
		swap(a,high,i+1);
		
		return i+1 ;
		
	}

	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}

	public static void main(String[] args) {
		int a[] = new int[] {2,8,3,5,7,56,11};
		int n = a.length;
		QuickSort q = new QuickSort();
		q.quick(a, 0, n-1);
		
		for(int j=0;j<n;j++) {
			System.out.print(a[j] + " ");
		}
	}

}
