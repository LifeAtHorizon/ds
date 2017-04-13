package ds.sorting;

/*
 * Bubble Sorting is the technique of sorting a random array 
 * But the time complexity of sorting will take O(n2)
 * Time Complexity : 2 loops 
 */
public class BubbleSorting {

	public Integer[] sort(Integer[] arr){
		int length = arr.length;
		for(int i=length;i>0;i--){
			for(int j=0;j<i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		return arr;
	}
	
	public void display(Integer[] arr){
		for(int i: arr){
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args){
		BubbleSorting bs = new BubbleSorting();
		Integer[] arr = {6,7,3,1,9,10};
		arr = bs.sort(arr);
		bs.display(arr);
	}
}

