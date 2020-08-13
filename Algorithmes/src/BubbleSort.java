import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

	static final int MAX_CHARS = 256; 

    static int findSubString(String str) 
    { 
        int n = str.length(); 

        int dist_count = 0; 
  
        boolean[] visited = new boolean[MAX_CHARS]; 
        Arrays.fill(visited, false); 
        for (int i = 0; i < n; i++) { 
            if (visited[str.charAt(i)] == false) { 
                visited[str.charAt(i)] = true; 
                dist_count++; 
            } 
        } 

        int start = 0, start_index = -1; 
        int min_len = Integer.MAX_VALUE; 
  
        int count = 0; 
        int[] curr_count = new int[MAX_CHARS]; 
        for (int j = 0; j < n; j++) { 
            
            curr_count[str.charAt(j)]++; 

            if (curr_count[str.charAt(j)] == 1) 
                count++; 
  
            if (count == dist_count) { 
                
                while (curr_count[str.charAt(start)] > 1) { 
                    if (curr_count[str.charAt(start)] > 1) 
                        curr_count[str.charAt(start)]--; 
                    start++; 
                } 
  
              
                int len_window = j - start + 1; 
                if (min_len > len_window) { 
                    min_len = len_window; 
                    start_index = start; 
                } 
            } 
        } 
        System.out.println(str.substring(start_index, start_index + min_len));
         return str.substring(start_index, start_index + min_len).length(); 
    } 
	public static void main(String[] args) {
		System.out.println(findSubString("bab"));
		//System.out.println(findSubString("dabbcabcd"));
		
		/*int array[] = {5,1,3,7,3};
		for(int i=0; i< array.length;i++)
		System.out.print(array[i]+", ");
		
		bubbleSort(array, 0, array.length);
		System.out.println("\n-----");
		for(int i=0; i< array.length;i++)
		System.out.print(array[i]+", ");
		int sum=0;
		for(int i=0;i < array.length-1;i++){

	            sum+=Math.abs(array[i]-array[i+1]);
	        }

		System.out.println("sum: "+sum);
		}*/
		//minPart();
	}

	private static void minPart(){
		List<Integer> used = new ArrayList<>();
		List<Integer> totalCapacity = new ArrayList<>();
		int arr[] = {3, 2, 1, 3, 1}; 
		int arr2[] = {3, 5, 3, 5, 5}; 
		for (int i : arr) {
			used.add(i);
		}
		for (int i : arr2) {
			totalCapacity.add(i);
		}
		int sumOfUsed =0;
		for (int i : used) {
			sumOfUsed+=i;
		}
		System.out.println(sumOfUsed);
		int count=0;
		for (Integer integer : totalCapacity) {
            if(integer < sumOfUsed/2){
                    count++;
            }
        }
		System.out.println(count);
	}
	private static void bubbleSort(int [] arr, int from, int to)
	{
		for (int i = from; i < to; i++) {
			for (int j = from; j< to-1 ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp= arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
