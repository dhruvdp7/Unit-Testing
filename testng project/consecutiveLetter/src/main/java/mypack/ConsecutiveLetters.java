package mypack;
import java.util.*;

public class ConsecutiveLetters {
	
	ArrayList<String> results=new ArrayList<String>();

	public ArrayList<String> getConsecutiveLetter(ArrayList<String> input) {
		
		for(int i=0;i<input.size();i++) {
			String word=new String(input.get(i));
			
			
			for(int j=0;j<word.length()-1;j++) {
				if(word.charAt(j)==word.charAt(j+1)) {
					results.add(word);
					break;
				}
			}			
			
		}
		System.out.println(results);
		
		return results;
		
	}
}	