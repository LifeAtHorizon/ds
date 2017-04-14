package ds.sorting;

public class SelectionSort {
	public void sort(int[] arr){
		int temp = 0;
		int index = 0;
		int length = arr.length;
		for(int i=0;i<length-1;i++){
			int initial = arr[i];
			temp = initial;
			for(int j=i+1;j<length;j++){
				if(arr[j]<initial){
					initial = arr[j];
					index = j;
				}
			}
			if(initial!=temp){
				arr[i] = initial;
				arr[index] = temp;
			}
		}
		
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
public static void main(String[] args){
	int[] arr = {4,1,7,2,3,0};
	SelectionSort ss = new SelectionSort();
	ss.sort(arr);
}
}
