package sort;

import java.util.Scanner;

/**
 * 퀵정렬 구현 소스
 * @since jdk 1.8
 * @author Genie
 */
public class QuickSort {
	
	public static void main(String[] args) {
		/**
		 * sc Scanner 클래스를 이용하여 사용자의 입력을 받을 객체 생성
		 * testCaseNum 정렬할 배열의 크기를 입력받을 변수
		 * arr 정렬할 배열의 값들이 저장될 배열 변수 
		 */
		Scanner sc = new Scanner(System.in);
		int testCaseNum = 0;
		
		System.out.print("배열의 길이를 입력하세요: ");
		testCaseNum = sc.nextInt();
		int[] arr = new int[testCaseNum];
		System.out.print("배열의 값을 입력해주세요: ");
		for(int index=0; index<arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		quickSort(arr, 0, arr.length-1);
		printArray(arr);
	}
	
	/**
	 * 퀵정렬 메서드
	 * @param arr 배열
	 * @param start 시작 위치
	 * @param end 끝나는 위치
	 */
	public static void quickSort(int[] arr, int start, int end) {
		int pivot = start;
		int low = start+1;
		int big = end;
		if(start==end)
			return;
		while(low<end){
			if(low!=end && arr[low]>arr[pivot])
				break;
			low++;
		}
		while(big>start) { 
			if(big!=start && arr[big]<arr[pivot])
				break;
			big--;
		}
		
		if(low==end) {
			System.out.println("1");
			start++;
		} else if(big==start) {
			System.out.println("12");
			arr[pivot] = arr[big]+arr[pivot];
			arr[big] = arr[pivot]-arr[big];
			arr[pivot] = arr[pivot]-arr[big];
		} else if(low>big) {
			System.out.println("13");
			arr[low] = arr[low]+arr[big];
			arr[big] = arr[low]-arr[big];
			arr[low] = arr[low]-arr[big];
			if(low-big==1) {
				arr[pivot] = arr[big]+arr[pivot];
				arr[big] = arr[pivot]-arr[big];
				arr[pivot] = arr[pivot]-arr[big]; 
			}
		}
//		quickSort(arr, start, );
//		quickSort(arr, pivot+1, end);
	}

	/**
	 * 파라미터로 받은 int 배열 arr 출력하기
	 * @param arr
	 */
	public static void printArray(int[] arr) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
}
