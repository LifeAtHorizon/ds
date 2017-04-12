package ds.questions;

import java.util.Arrays;

/*
 * Find the highest frequency number in an array
 * That is in a number the highest repeating number
 */
public class HighestFrequencyNumber {
int[] a = {1, 2, 1, 0, 5, 3, 4, 2, 3, 0, 1, 3, 2, 4,3};
public void sortArray(){
	 Arrays.sort(a);
}
public void printArray(){
	for(int i: a){
		System.out.print(i+" ");
	}
	System.out.println();
}
public void findHigestFreqNumebr(){
	int size = a.length;
	int freq1=0;
	int freq2 = 0;
	int i=0;
	int num=0;
	printArray();
	while(i<size-1){
		if(a[i]==a[i+1]){
			freq1++;
		}
		else
		{
			if(freq1>freq2){
			freq2 = freq1;
			num = a[i];
			}
			freq1=0;
		}
		i++;
	}
	System.out.println("number "+num+" freq "+(freq2+1));
}
public static void main(String[] args){
HighestFrequencyNumber highfreq = new HighestFrequencyNumber();
highfreq.sortArray();

highfreq.findHigestFreqNumebr();

}
}
