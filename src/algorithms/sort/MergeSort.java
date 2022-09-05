package algorithms.sort;

import java.util.Arrays;

/***
 * 
 * @author Satish Singh
 *
 *	MergeSort(arr[], l,  r)
	If r > l
	     1. Find the middle point to divide the array into two halves:  
	             middle m = l+ (r-l)/2
	     2. Call mergeSort for first half:   
	             Call mergeSort(arr, l, m)
	     3. Call mergeSort for second half:
	             Call mergeSort(arr, m+1, r)
	     4. Merge the two halves sorted in step 2 and 3:
	             Call merge(arr, l, m, r)
 */
public class MergeSort {
	
	
	public  void MergeSortOne(int arr[], int l, int r) {
		
		if(l<r) {
			int m = l + (r-l)/2;
			
			MergeSortOne(arr , l , m);
			
			MergeSortOne(arr , m+1 , r);
			
			Merge(arr,l,m,r);
			
		}	
		
	}
	
	public  void Merge(int arr[], int l, int m , int r) {
		
		int x = m - l + 1;
		int y = r - m;
		int a[] = new int[x];
		int b[] = new int[y];
		
		for(int i=0,j=l;i<x;i++,j++) {
			a[i] = arr[j];
		}
		
		for(int i=0,j=m+1;i<y;i++,j++) {
			b[i] = arr[j];
		}
		
		
		
		int i=0,j=0,k=l;
		while(i<x && j<y) {
			if(a[i] < b[j]) {
				arr[k++] = a[i++];
			}
			else {
				arr[k++] = b[j++];
			}
		}
		if(i<x) {
			for(int z =i;z<x;z++) {
				arr[k++] = a[z];
			}
		}
		
		if(j<y) {
			for(int z =i;z<y;z++) {
				arr[k++] = b[z];
			}
		}
	}
		
	public static void main(String[] args) {
		int a[] = { 2,8,3,5,7,56,11};
		int n = a.length;
		MergeSort m = new MergeSort();
		m.MergeSortOne(a, 0, n-1);
		
		Arrays.stream(a).forEach(ab -> System.out.print(ab + ", "));
	}

}


