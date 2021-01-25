package java_chobo.ch05;

import java.util.Arrays;

public class ArrayEx05 {
	public static void main(String[] args) {

		int[] intArr = {9, 10, 23, 15, 4, 3, 1, 2, 99, 100};
		
		System.out.println("배열 > " + Arrays.toString(intArr));
		int searchKey = 2;
		
		// 1. 선형검색 Linear Search
		int find = linearSearch(intArr, searchKey);
		System.out.printf("%d는 intArr의 index %d번 칸에 있습니다.%n", searchKey, find);
		
		// 2. 이분검색
		int find2 = binarySearch(intArr, searchKey);
		System.out.printf("%d는 intArr의 index %d번 칸에 있습니다.%n", searchKey, find2);
		
		 
		
		
	}

	private static int binarySearch(int[] intArr, int searchKey) {
		
		int index = -1;
		int i;
		int j;
		int temp = 0;
		
		// bubblesort 시작
		
		for(i = 0; i < intArr.length - 1; i++) {
			for(j = 0; j < intArr.length - i - 1; j++) {
				if(intArr[j] > intArr[j + 1]){
					temp = intArr[j];
					intArr[j] = intArr[j + 1];
					intArr[j + 1] = temp;
				}
			}
		}
		
		// bubblesort 끝
		
		// binary search 시작
		int left = 0;
		int right = intArr.length - 1;
		int mid;
		
		for(;left <= right;) {
			
			mid = (left + right) / 2;
			
			if(intArr[mid] == searchKey) {
				index = mid;
				break;
			}else if(intArr[mid] > searchKey) {
				right = mid - 1;
			}else if(intArr[mid] < searchKey) {
				left = mid + 1;
			}
			
		}
		
		return index;
		
	}

	
	private static int linearSearch(int[] intArr, int searchKey) {
		
		int index = -1; 
		int i;
		
		for(i = 0; i < intArr.length; i++) {
			if(intArr[i] == searchKey) {
				index = i;
				break;
			}
		}
		return index;
		
	}
}
