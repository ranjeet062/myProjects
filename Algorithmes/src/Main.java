import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
	
		
		BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 

		System.out.println("give input");
		int noOfrecord= Integer.parseInt(reader.readLine());

		Map<String, String> map = new HashMap<>();
		String [] token = null;
		for(int i=0 ; i< noOfrecord; i++){
			String s =reader.readLine();
			token = s.split(" ");
			map.put(token[0]+"-"+token[1], token[2]);
			
			}
		String pinString =reader.readLine();
		int pin= Integer.parseInt(pinString);
		String range="";
		String [] token2 = null;
		
		for (Map.Entry<String,String> entry : map.entrySet())  {
			range = entry.getKey();
		    token2 = range.split("-");
           if(Integer.parseInt(token2[0]) <= pin && Integer.parseInt(token2[1]) >= pin){
        	   System.out.println(entry.getValue());
        	   break;
           }
             
		}
      
		
	}
	
}
