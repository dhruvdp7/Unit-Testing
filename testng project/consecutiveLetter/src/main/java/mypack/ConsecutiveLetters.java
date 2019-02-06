package mypack;
import java.util.*;

public class ConsecutiveLetters {
	
	ArrayList<String> results=new ArrayList<String>();

	public ArrayList<String> getConsecutiveLetter(ArrayList<String> input) {
		
		for(int i=0;i<input.size();i++) {
			String word=new String(input.get(i));
			String s=word.toLowerCase();
			System.out.println(word);
			
			for(int j=0;j<s.length()-1;j++) {
				if(s.charAt(j)==s.charAt(j+1)) {
					results.add(s);
					break;
				}
			}			
			
		}
		System.out.println(results);
		
		return results;
		
	}
}	