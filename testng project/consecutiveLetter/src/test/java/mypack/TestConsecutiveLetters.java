package mypack;
import java.util.*;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;



public class TestConsecutiveLetters {
	
	
	@Test
	public void testForPositiveScenario() {
		
	ConsecutiveLetters cl=new ConsecutiveLetters();
	
	ArrayList<String> inputWords=new ArrayList<String>();
	
	ArrayList<String> expectedWords=new ArrayList<String>();
	
	
	
	// actual input
	inputWords.add("apple");
	inputWords.add("mango");
	inputWords.add("hello");
	inputWords.add("letter");
	
	
	// expected output
	expectedWords.add("apple");
	expectedWords.add("hello");
	expectedWords.add("letter");
	
	
	ArrayList<String> actualWords=cl.getConsecutiveLetter(inputWords);
	
	AssertJUnit.assertEquals(expectedWords,actualWords);
	
    }
	
}
