
public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {1,3,5,7,9,11,13,15,17};
		System.out.println(binarySearch(arr, 0, arr.length-1, 9));
	}
	
	public static int binarySearch(int arr [], int left, int right, int data)
	{
		if(left <= right){
			int mid  = (left+right)/2;
			
			if(arr[mid] == data){
				return mid;
			}
			if(arr[mid] > data){
				 return binarySearch(arr, left, mid-1, data);
			}
			return binarySearch(arr, mid+1, right, data);
		}
		return -1;
	}
}
