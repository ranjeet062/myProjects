package test;

import java.util.Arrays;

public class MinWindowString {

	int MAX_CHAR = 256;
	
	public void minWindowStr(String str){
		int n = str.length();
		int noOfDistinct = 0;
		boolean[] visited = new boolean[MAX_CHAR];
		Arrays.fill(visited, false);
		for(int i =0 ; i< n ; i++){
			if(visited[str.charAt(i)] == false){
				visited[str.charAt(i)]=true;
				noOfDistinct++;
			}
		}
		System.out.println("distinct char in '" +str+ "' string = "+ noOfDistinct);
		
		int count=0;
		int[] curr_count = new int[MAX_CHAR];
		int start=0;
		int min_len=Integer.MAX_VALUE;
		int start_index=-1;
		for(int j=0; j< n;j++){
			
			curr_count[str.charAt(j)]++;
			
			if(curr_count[str.charAt(j)] == 1){
				count++;
			}
			
			if(count==noOfDistinct){
				
				while(curr_count[str.charAt(start)] > 1){
					if(curr_count[str.charAt(start)] > 1){
						curr_count[str.charAt(start)]--;
					}
					start++;
				}
				int len_window = j-start+1;
				if(min_len > len_window){
					min_len = len_window;
					start_index =start;
				}
			}
		}
		System.out.println("subString = "+str.subSequence(start_index, start_index+min_len));
		System.out.println("lenght of subString = "+str.subSequence(start_index, start_index+min_len));
		
	}
}
