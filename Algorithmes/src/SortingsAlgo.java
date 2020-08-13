
public class SortingsAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,100,20,60,80,30,50,40,70,90};
//		int [] array = selectionSort(arr);
//		printArr(array);
		int [] array = insertionSort(arr);
		printArr(array);
	}
	
	public static void printArr(int [] arr){
		System.out.print("Arrays: ");
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}
	public static int [] selectionSort(int [] arr){
		
		int sizeOfArr = arr.length;
		for(int i=0; i< sizeOfArr-1 ; i++){
			int min_index= i;
			for(int j= i+1; j< sizeOfArr;j++){
				if(arr[j] < arr[min_index] )
				{
					min_index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
		}
		return arr;
		
		
	}

	public static int [] insertionSort(int [] arr){
		
		for(int i=1; i< arr.length; i++){
			int key = arr[i];
			int j= i-1;
			
			while(j >=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		return arr;
	}
}
