import java.util.*;

class InsertionSort{
	
	void insertSort(int[] arr){
		
		int len = arr.length;
		int element = arr[len-1];
		
		for(int i =len-2;i>=0;i-- ){
			if(arr[i]>element){
				
				arr[i+1] = arr[i];
				printArr(arr);
			}else{
				arr[i+1] = element;
				printArr(arr);
				break;
			}
			if(arr[i]>element && i == 0){
				arr[i] = element;
				printArr(arr);
			}
		}
		
	}
	
	void printArr(int[] arr){
		
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		InsertionSort Is = new InsertionSort();
		System.out.println("Enter Size of Array");
		int size = sc.nextInt();
		
		int[] arr1 = new int[size];
		
		
		System.out.println("Enter Elements of Array");
		for(int i = 0; i<size;i++){
			arr1[i] = sc.nextInt();
		}
		
		Is.insertSort(arr1);
	}
}