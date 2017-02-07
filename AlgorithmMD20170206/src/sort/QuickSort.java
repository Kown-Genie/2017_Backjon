package sort;

import java.util.Scanner;

/**
 * ������ ���� �ҽ�
 * @since jdk 1.8
 * @author Genie
 */
public class QuickSort {
	
	public static void main(String[] args) {
		/**
		 * sc Scanner Ŭ������ �̿��Ͽ� ������� �Է��� ���� ��ü ����
		 * testCaseNum ������ �迭�� ũ�⸦ �Է¹��� ����
		 * arr ������ �迭�� ������ ����� �迭 ���� 
		 */
		Scanner sc = new Scanner(System.in);
		int testCaseNum = 0;
		
		System.out.print("�迭�� ���̸� �Է��ϼ���: ");
		testCaseNum = sc.nextInt();
		int[] arr = new int[testCaseNum];
		System.out.print("�迭�� ���� �Է����ּ���: ");
		for(int index=0; index<arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		quickSort(arr, 0, arr.length-1);
		printArray(arr);
	}
	
	/**
	 * ������ �޼���
	 * @param arr �迭
	 * @param start ���� ��ġ
	 * @param end ������ ��ġ
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
	 * �Ķ���ͷ� ���� int �迭 arr ����ϱ�
	 * @param arr
	 */
	public static void printArray(int[] arr) {
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
}
